package com.samsung.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samsung.entity.ContractEmployee;
import com.samsung.entity.Employee;
import com.samsung.entity.Manager;

public class App5 {

	public static void main(String[] args) {
		// step-1: create the configuration object
		// this info is needed to create the session factory
		Configuration conf = new Configuration().configure();
		conf.addAnnotatedClass(Employee.class);
		conf.addAnnotatedClass(Manager.class);
		conf.addAnnotatedClass(ContractEmployee.class);
		

		// step-2: build the session factory using configuration object - it is like a
		// Connection Pool in jdbc
		SessionFactory factory = conf.buildSessionFactory();

		// step-3: get session from session factory - it is like a Connection in jdbc
		Session session = factory.openSession();
		
		Employee employee = new Employee();
		employee.setEmpName("srinivas");
		employee.setSalary(56000.0);
		
		Manager manager = new Manager();
		manager.setEmpName("vamsy");
		manager.setSalary(78000.0);
		manager.setBonus(7800);
		
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setEmpName("varun");
		contractEmployee.setSalary(23000.0);
		contractEmployee.setDuration(90);
		
		Transaction txn = session.getTransaction();
		txn.begin();
		session.save(employee);
		session.save(manager);
		session.save(contractEmployee);
		txn.commit();

		session.close();
		factory.close();

	}

}
