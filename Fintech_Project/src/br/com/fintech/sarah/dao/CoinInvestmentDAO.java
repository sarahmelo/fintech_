package br.com.fintech.sarah.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fintech.sarah.connection.jdbc.FintechDbManager;
import br.com.fintech.sarah.investment.Investment;

public class CoinInvestmentDAO {
	private Connection connection;
	
	public void registerCoinInvestiment(Investment investment) {
		PreparedStatement stmt = null;
		
		try {
			connection = FintechDbManager.connect();
			
			String query = "INSERT INTO T_COIN_INVESTMENT (ID_INVESTMENT, NM_COIN, TX_QUOTA, QT_PURCHASED, DT_CREATED_AT, DT_DELETED_AT, ID_ACCOUNT) VALUES (SQ_ID_COIN_INVESTMENT.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			
			java.sql.Date date = new java.sql.Date(investment.getCreatedAt().getTimeInMillis());

			stmt = connection.prepareStatement(query);
			stmt.setString(1, investment.getName());
			stmt.setFloat(2, investment.getQuota());
			stmt.setFloat(3, investment.getQuantityPurchased());
			stmt.setDate(4, date);
			stmt.setDate(5, null);
			stmt.setInt(6, investment.getIdAccount());
			
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
