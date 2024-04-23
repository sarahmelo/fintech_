package br.com.fintech.sarah.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fintech.sarah.connection.jdbc.FintechDbManager;
import br.com.fintech.sarah.historic.Debit;

public class DebitDAO {
	private Connection connection;
	
	public void register(Debit debit) {
		PreparedStatement stmt = null;
		
		try {
			connection = FintechDbManager.connect();
			
			String query = "INSERT INTO T_DEBIT (ID_DEBIT, NM_DEBIT, VL_DEBIT, NM_CATEGORY, DT_CREATED_AT, DT_DELETED_AT, ID_ACCOUNT) VALUES (SQ_ID_DEBIT.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			
			java.sql.Date date = new java.sql.Date(debit.getCreatedAt().getTimeInMillis());

			stmt = connection.prepareStatement(query);
			stmt.setString(1, debit.getName());
			stmt.setFloat(2, debit.getValue());
			stmt.setString(3, debit.getCategory());
			stmt.setDate(4, date);
			stmt.setDate(5, null);
			stmt.setInt(6, debit.getIdAccount());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {					
					stmt.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				} 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
