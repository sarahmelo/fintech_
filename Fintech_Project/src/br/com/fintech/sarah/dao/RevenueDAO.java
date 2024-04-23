package br.com.fintech.sarah.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fintech.sarah.connection.jdbc.FintechDbManager;
import br.com.fintech.sarah.historic.Revenue;

public class RevenueDAO {
	private Connection connection;
	
	public void register(Revenue revenue) {
		PreparedStatement stmt = null;
		
		try {
			connection = FintechDbManager.connect();
			
			String query = "INSERT INTO T_REVENUE (ID_REVENUE, NM_REVENUE, VL_REVENUE, NM_CATEGORY, DT_CREATED_AT, DT_DELETED_AT, ID_ACCOUNT) VALUES (SQ_ID_REVENUE.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			
			java.sql.Date date = new java.sql.Date(revenue.getCreatedAt().getTimeInMillis());

			stmt = connection.prepareStatement(query);
			stmt.setString(1, revenue.getName());
			stmt.setFloat(2, revenue.getValue());
			stmt.setString(3, revenue.getCategory());
			stmt.setDate(4, date);
			stmt.setDate(5, null);
			stmt.setInt(6, revenue.getIdAccount());
			
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
