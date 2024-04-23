package br.com.fintech.sarah.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fintech.sarah.account.Account;
import br.com.fintech.sarah.connection.jdbc.FintechDbManager;

public class AccountDAO {
	private Connection connection;

	public void registerAccount(Account account) {
		PreparedStatement stmt = null;
		
		try {
			connection = FintechDbManager.connect();
			
			String query = "INSERT INTO T_ACCOUNT (ID_ACCOUNT, NM_EMAIL, CD_PASSWORD, DT_CREATED_AT, DT_DELETED_AT, ID_USER) VALUES (SQ_ID_ACCOUNT.NEXTVAL, ?, ?, ?, ?, ?)";
			
			java.sql.Date date = new java.sql.Date(account.getCreatedAt().getTimeInMillis());

			stmt = connection.prepareStatement(query);
			stmt.setString(1, account.getEmail());
			stmt.setString(2, account.getPassword());
			stmt.setDate(3, date);
			stmt.setDate(4, null);
			stmt.setInt(5, account.getIdUser());
			
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
