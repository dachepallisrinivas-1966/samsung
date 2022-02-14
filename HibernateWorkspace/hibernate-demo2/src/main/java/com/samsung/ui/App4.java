package com.samsung.ui;

import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.samsung.entity.Account;
import com.samsung.entity.Department;
import com.samsung.entity.Employee;

public class App4 {

	public static void main(String[] args) {
		// step-1: create the configuration object
		// this info is needed to create the session factory
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		conf.addAnnotatedClass(Employee.class);
		conf.addAnnotatedClass(Department.class);
		conf.addAnnotatedClass(Account.class);
		
		// step-2: build the session factory using configuration object	-	it is like a Connection Pool in jdbc
		SessionFactory factory = conf.buildSessionFactory();
		
		// step-3: get session from session factory - it is like a Connection in jdbc
		Session session = factory.openSession();
		

		TypedQuery<Department> query = session.createQuery("from Department e", Department.class);		// HQL
		List<Department> depts = query.getResultList();
		
		for(Department department : depts) {
			System.out.println(department.getDeptId() + "\t" + department.getDeptName());
			Set<Employee> emps = department.getEmployees();
			System.out.println(emps);
		}
		
		session.close();
		factory.close();
	}

}
