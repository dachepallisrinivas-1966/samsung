package com.samsung.ui;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App1 {

	public static void main(String[] args) {
		try {
			// step-1: register the drive class (optional from jdk1.8)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2: establish connection
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			System.out.println("connected");
		} catch (ClassNotFoundException excep) {
			System.out.println("could not load jdbc driver.");
		} catch (SQLException excep) {
			System.out.println("could not connect");
		}

	}

}
