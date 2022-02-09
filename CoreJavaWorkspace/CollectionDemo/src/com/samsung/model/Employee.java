package com.samsung.model;

public class Employee implements Comparable<Employee>{ 
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		/* no implementation required */
	}
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, empName=%s, salary=%s", empId, empName, salary);
	}

	@Override
	public int compareTo(Employee o) {
		
		int result = -1;
		if (this.empId == o.empId)
			result = 0;
		else if (this.empId > o.empId)
			result = 1;
		
		
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		Employee other = (Employee)o;
		boolean isEqual = false;
		if (this.empId == other.empId && this.empName.equals(other.empName) && this.salary == other.salary)
			isEqual = true;
		return isEqual;
	}
	
	@Override
	public int hashCode() {
		return empId;
	}
} 