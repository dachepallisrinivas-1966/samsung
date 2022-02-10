package com.samsung.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App5 {

	public static void main(String[] args) {

		String sql = "SELECT job_id, job_title FROM jobs";
		
		// try-with-resources
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			) {

			String jobId, jobTitle;
			
			while (rs.next()) {
				jobId = rs.getString(1);
				jobTitle = rs.getString(2);
				System.out.printf("%-15s%-10s\n", jobId, jobTitle);
			}
			
		} catch(SQLException excep) {
			System.out.println(excep.getMessage());
		} 

	}

}
