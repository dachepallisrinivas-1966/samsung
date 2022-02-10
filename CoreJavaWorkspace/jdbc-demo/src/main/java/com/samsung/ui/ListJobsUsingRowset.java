package com.samsung.ui;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class ListJobsUsingRowset {

	public static void main(String[] args) throws Exception {
		CachedRowSet crs = new OracleCachedRowSet();
		crs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		crs.setUsername("hr");
		crs.setPassword("hr");

		crs.setCommand("select * from jobs where min_salary > ?");
		crs.setInt(1, 5000);
		
		crs.execute();
		while (crs.next()) {
			System.out.println(crs.getString(2) + ":" + crs.getInt(3));
		}
		crs.close(); 
	}

}