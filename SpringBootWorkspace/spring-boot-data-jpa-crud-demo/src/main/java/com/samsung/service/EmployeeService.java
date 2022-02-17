package com.samsung.service;

import java.util.List;

import com.samsung.entity.Employee;

public interface EmployeeService {
	Employee save(Employee employee);
	void deleteById(Long empId);
	Employee findById(Long empId);
	List<Employee> findAll();
}
