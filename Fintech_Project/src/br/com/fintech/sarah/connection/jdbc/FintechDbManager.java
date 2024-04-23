package br.com.fintech.sarah.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FintechDbManager {
	public static void main(String[] args) {
		connect();
	}
	
	public static Connection connect() {
		Connection connection = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM552975",
					"260899"
			);
			
			System.out.println("Conectado!");
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return connection;
	}
}
