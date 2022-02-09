package com.samsung.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.samsung.model.Employee;
import com.samsung.service.NameComparator;

public class EmployeeListApp {

	public static void main(String[] args) {
		// program-to-interfaces
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "srinivas", 30000.0));
		list.add(new Employee(103, "vandana", 60000.0));
		list.add(new Employee(102, "varshini", 25000.0));
		list.add(new Employee(106, "ramya", 15000.0));
		list.add(new Employee(104, "sravya", 29000.0));
		list.add(new Employee(105, "priya", 31000.0));
		
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------");
		
		ListIterator<Employee> it = list.listIterator(list.size());
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println("------------------------------------------------");
		
		Collections.sort(list);
		
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------");
		
		// Collections.sort(list, new SalaryComparator());
		Collections.sort(list, new NameComparator());
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------");
	}

}