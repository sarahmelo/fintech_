package br.com.fintech.sarah.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fintech.sarah.account.User;
import br.com.fintech.sarah.connection.jdbc.FintechDbManager;

public class UserDAO {
	private Connection connection;
	
	public void registerUser(User user) {
		PreparedStatement stmt = null;
		
		try {
			connection = FintechDbManager.connect();
			
			String query = "INSERT INTO T_USER (ID_USER, CD_CPF, NM_USER, DT_BIRTHDATE, NM_GENDER) VALUES (SQ_ID_USER.NEXTVAL, ?, ?, ?, ?)";
			
			java.sql.Date date = new java.sql.Date(user.getBirthdate().getTimeInMillis());

			stmt = connection.prepareStatement(query);
			stmt.setString(1, user.getCpf());
			stmt.setString(2, user.getName());
			stmt.setDate(3, date);
			stmt.setString(4, user.getGender());
			
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
