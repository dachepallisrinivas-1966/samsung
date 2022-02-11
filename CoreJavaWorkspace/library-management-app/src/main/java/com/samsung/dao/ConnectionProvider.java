package com.samsung.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	private static ConnectionProvider instance;
	private static Connection con;
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "hr";
	private static String PASSWORD = "hr";
	
	
	private ConnectionProvider() throws SQLException {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch(ClassNotFoundException excep) {
			System.err.println("Driver not found");
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
	
	public static ConnectionProvider getInstance() throws SQLException {
		if (instance == null) {
			instance = new ConnectionProvider();
		} else if (getConnection().isClosed()) {
			instance = new ConnectionProvider();
		}
		return instance;
	}

	
}
