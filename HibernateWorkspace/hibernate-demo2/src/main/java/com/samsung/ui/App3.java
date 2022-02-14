package com.samsung.ui;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samsung.entity.Account;
import com.samsung.entity.Department;
import com.samsung.entity.Employee;

public class App3 {

	public static void main(String[] args) {
		// step-1: create the configuration object
		// this info is needed to create the session factory
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		conf.addAnnotatedClass(Employee.class);
		conf.addAnnotatedClass(Account.class);
		conf.addAnnotatedClass(Department.class);
				
		// step-2: build the session factory using configuration object	-	it is like a Connection Pool in jdbc
		SessionFactory factory = conf.buildSessionFactory();
		
		// step-3: get session from session factory - it is like a Connection in jdbc
		Session session = factory.openSession();
		
		Department dept = new Department();
		dept.setDeptName("sales");
		
		Set<Employee> emps = new HashSet<>();
		Employee emp1 = new Employee();
		emp1.setEmpName("raghu");
		emp1.setBasic(11000.0);
		emp1.setDepartment(dept);

		Employee emp2 = new Employee();
		emp2.setEmpName("ramana");
		emp2.setBasic(12000.0);
		emp2.setDepartment(dept);
		
		Employee emp3 = new Employee();
		emp3.setEmpName("roja");
		emp3.setBasic(13000.0);
		emp3.setDepartment(dept);
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
		dept.setEmployees(emps);
		
		Transaction txn = session.getTransaction();
		txn.begin();
		
		session.save(dept);
		
		txn.commit();
		
		session.close();
		factory.close();
	}

}
