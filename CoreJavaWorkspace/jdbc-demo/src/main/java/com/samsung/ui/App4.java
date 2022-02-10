package com.samsung.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		Scanner scan = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			scan = new Scanner(System.in);
			System.out.print("Enter job id : ");
			String jobId = scan.nextLine();
			System.out.print("Enter job title : ");
			String jobTitle = scan.nextLine();
			System.out.print("Enter minimum salary : ");
			int minSalary = scan.nextInt();
			System.out.print("Enter maximum salary : ");
			int maxSalary = scan.nextInt();
			
			
			String sql = "INSERT INTO jobs  (job_id, job_title, min_salary, max_salary) VALUES (?,?,?,?)";
				
			pst = con.prepareStatement(sql);
			pst.setString(1, jobId);
			pst.setString(2, jobTitle);
			pst.setInt(3, minSalary);
			pst.setInt(4, maxSalary);
			
			int rowsInserted = pst.executeUpdate();
			if (rowsInserted == 1)
				System.out.println("row inserted");
			else
				System.out.println("insertion error");
			
			
		} catch(ClassNotFoundException excep) {
			System.out.println(excep.getMessage());
		} catch(SQLException excep) {
			System.out.println(excep.getMessage());
		} finally {
			scan.close();
			try {
				pst.close();
			} catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
			try {
				con.close();
			} catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
			
		}
 	}

}
