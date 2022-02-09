package com.samsung.ui;

import java.util.HashSet;
import java.util.Set;

import com.samsung.model.Employee;

public class EmployeeSetApp {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(101, "srinivas", 30000.0));
		set.add(new Employee(103, "vandana", 60000.0));
		set.add(new Employee(102, "varshini", 25000.0));
		set.add(new Employee(106, "ramya", 15000.0));
		set.add(new Employee(104, "sravya", 29000.0));
		set.add(new Employee(105, "priya", 31000.0));
		set.add(new Employee(105, "priya", 31000.0));
		
		for(Employee employee : set) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------");
	}

}