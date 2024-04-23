package br.com.fintech.sarah.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fintech.sarah.connection.jdbc.FintechDbManager;
import br.com.fintech.sarah.historic.Expense;

public class ExpenseDAO {
	private Connection connection;
	
	public void register(Expense expense) {
		PreparedStatement stmt = null;
		
		try {
			connection = FintechDbManager.connect();
			
			String query = "INSERT INTO T_EXPENSE (ID_EXPENSE, NM_EXPENSE, VL_EXPENSE, NM_CATEGORY, DT_CREATED_AT, DT_DELETED_AT, ID_ACCOUNT) VALUES (SQ_ID_EXPENSE.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			
			java.sql.Date date = new java.sql.Date(expense.getCreatedAt().getTimeInMillis());

			stmt = connection.prepareStatement(query);
			stmt.setString(1, expense.getName());
			stmt.setFloat(2, expense.getValue());
			stmt.setString(3, expense.getCategory());
			stmt.setDate(4, date);
			stmt.setDate(5, null);
			stmt.setInt(6, expense.getIdAccount());
			
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
