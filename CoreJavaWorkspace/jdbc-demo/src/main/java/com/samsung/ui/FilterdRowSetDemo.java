package com.samsung.ui;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;

import oracle.jdbc.rowset.OracleFilteredRowSet;

class CostlyEmployees implements Predicate {
	@Override
	public boolean evaluate(RowSet rs) {
	   try {
		 return  rs.getInt("salary") > 10000;
	   }
	   catch(Exception ex) {
		   return false;
	   }
	}

	@Override
	public boolean evaluate(Object value, int column) throws SQLException {
		return false;
	}

	@Override
	public boolean evaluate(Object value, String columnName) throws SQLException {
		return false;
	}
	
}

class CheapEmployees implements Predicate {
	@Override
	public boolean evaluate(RowSet rs) {
	   try {
		 return  rs.getInt("salary") < 3000;
	   }
	   catch(Exception ex) {
		   return false;
	   }
	}

	@Override
	public boolean evaluate(Object value, int column) throws SQLException {
		return false;
	}

	@Override
	public boolean evaluate(Object value, String columnName) throws SQLException {
		return false;
	}
	
}
public class FilterdRowSetDemo {

	public static void main(String[] args) throws Exception {
		FilteredRowSet frs = new OracleFilteredRowSet();
		frs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		frs.setUsername("hr");
		frs.setPassword("hr");
		frs.setCommand("select * from employees");
		frs.execute();
		// Display costly employees
		frs.setFilter( new CostlyEmployees());
		
		while (frs.next()) {
			System.out.println(frs.getString("first_name") + ":" + frs.getInt("salary"));
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		frs.setFilter( new CheapEmployees());
		frs.beforeFirst();
		
		while (frs.next()) {
			System.out.println(frs.getString("first_name") + ":" + frs.getInt("salary"));
		}
		
		frs.close(); 
	}

}