package com.samsung.ui;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.samsung.entity.ContractEmployee;
import com.samsung.entity.Employee;
import com.samsung.entity.Job;
import com.samsung.entity.Manager;

public class App6 {

	public static void main(String[] args) {
		// step-1: create the configuration object
		// this info is needed to create the session factory
		Configuration conf = new Configuration().configure();
		conf.addAnnotatedClass(Employee.class);
		conf.addAnnotatedClass(Manager.class);
		conf.addAnnotatedClass(ContractEmployee.class);
		
		// step-2: build the session factory using configuration object	-	it is like a Connection Pool in jdbc
		SessionFactory factory = conf.buildSessionFactory();
		
		// step-3: get session from session factory - it is like a Connection in jdbc
		Session session = factory.openSession();
		
	
		TypedQuery<Employee> query = session.createQuery("from Employee e", Employee.class);		// HQL
		List<Employee> emps = query.getResultList();
		for(Employee e : emps) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");
		
		TypedQuery<Manager> query2 = session.createQuery("from Manager m", Manager.class);		// HQL
		List<Manager> mgrs = query2.getResultList();
		for(Manager m : mgrs) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------------");
		
		TypedQuery<ContractEmployee> query3 = session.createQuery("from ContractEmployee c", ContractEmployee.class);		// HQL
		List<ContractEmployee> cemps = query3.getResultList();
		for(ContractEmployee c : cemps) {
			System.out.println(c);
		}
		session.close();
		factory.close();
	}

}