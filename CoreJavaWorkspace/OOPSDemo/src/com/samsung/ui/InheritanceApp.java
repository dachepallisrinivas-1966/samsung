package com.samsung.ui;

import com.samsung.model.Employee;
import com.samsung.model.Manager;
import com.samsung.model.Person;
import com.samsung.model.Student;

public class InheritanceApp {

	public static void main(String[] args) {
		// Person person = new Person("srinivas", 56);
		// System.out.println(person);
		
		Employee employee = new Employee("vivek", 21, 15000.0);
		System.out.println(employee);
		
		Student student = new Student("swetha", 17, 25000.0);
		System.out.println(student);
		
		Manager manager = new Manager("ravi", 35, 60000.0, 6500.0);
		System.out.println(manager);
	}

}
