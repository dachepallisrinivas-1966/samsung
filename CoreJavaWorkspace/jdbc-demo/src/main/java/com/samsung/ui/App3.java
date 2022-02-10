package com.samsung.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
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
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO jobs  (job_id, job_title, min_salary, max_salary) VALUES ('");
			sql.append(jobId);
			sql.append("','");
			sql.append(jobTitle);
			sql.append("',");
			sql.append(minSalary);
			sql.append(",");
			sql.append(maxSalary);
			sql.append(")");
			
			st = con.createStatement();
			int rowsInserted = st.executeUpdate(sql.toString());
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
				st.close();
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
