package com.samsung.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App2 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			// step-1: register the drive class (optional from jdk1.8)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2: establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			String sql = "INSERT INTO jobs(job_id, job_title, min_salary, max_salary) VALUES ('j1', 'tester', 30000, 40000)";
			
			// step-3: create Statement object 
			st = con.createStatement();
			
			// step-4: execute Query
			int count = st.executeUpdate(sql);
			
			if (count == 1)
				System.out.println("row inserted");
			else
				System.out.println("insertion error");
			
		} catch (ClassNotFoundException excep) {
			System.out.println("could not load jdbc driver.");
		} catch (SQLException excep) {
			System.out.println("could not connect");
		} finally {
			// step-5: close the connection
			try {
				st.close();
				con.close();
			} catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
			
		}

	}

}
