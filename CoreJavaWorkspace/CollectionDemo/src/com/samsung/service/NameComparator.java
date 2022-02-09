package com.samsung.service;

import java.util.Comparator;

import com.samsung.model.Employee;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String firstName = o1.getEmpName();
		String secondName = o2.getEmpName();
		
		return firstName.compareTo(secondName);
	}

}
