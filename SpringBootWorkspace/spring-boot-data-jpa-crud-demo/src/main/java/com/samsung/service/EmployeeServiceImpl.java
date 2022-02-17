package com.samsung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samsung.dao.EmployeeRepository;
import com.samsung.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteById(Long empId) {
		employeeRepo.deleteById(empId);
	}

	@Override
	public Employee findById(Long empId) {
		return employeeRepo.findById(empId).orElse(null);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

}
