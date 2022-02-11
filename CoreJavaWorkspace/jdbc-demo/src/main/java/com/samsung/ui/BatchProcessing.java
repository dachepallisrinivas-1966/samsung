package com.samsung.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchProcessing {

	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			String sql = "INSERT INTO jobs(job_id, job_title, min_salary, max_salary) VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			Scanner scan = new Scanner(System.in);

			while (true) {

				System.out.print("Enter Job id : ");
				String jobId = scan.nextLine();

				System.out.print("Enter Job Title : ");
				String jobTitle = scan.nextLine();

				System.out.print("Enter Min Salary : ");
				int minSalary = scan.nextInt();

				System.out.print("Enter Max Salary : ");
				int maxSalary = scan.nextInt();

				ps.setString(1, jobId);
				ps.setString(2, jobTitle);
				ps.setInt(3, minSalary);
				ps.setInt(4, maxSalary);

				ps.addBatch();
				System.out.println("Want to add more records y/n");
				String ans = scan.nextLine();
				if (ans.equals("n")) {
					break;
				}

			}
			ps.executeBatch();// for executing the batch

			System.out.println("record successfully saved");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
