package com.samsung.service;

import java.util.Comparator;

import com.samsung.model.Employee;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Double firstSalary = o1.getSalary();
		Double secondSalary = o2.getSalary();
		
		return firstSalary.compareTo(secondSalary);
	}

}
