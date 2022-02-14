package com.samsung.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samsung.entity.Account;
import com.samsung.entity.Employee;

public class App1 {

	public static void main(String[] args) {
		// step-1: create the configuration object
		// this info is needed to create the session factory
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		conf.addAnnotatedClass(Employee.class);
		conf.addAnnotatedClass(Account.class);
		
		// step-2: build the session factory using configuration object	-	it is like a Connection Pool in jdbc
		SessionFactory factory = conf.buildSessionFactory();
		
		// step-3: get session from session factory - it is like a Connection in jdbc
		Session session = factory.openSession();
		
		Account account = new Account();
		account.setBankName("HDFC");
		
		Employee employee = new Employee();
		employee.setEmpName("devi");
		employee.setBasic(33000.0);
		employee.setSalaryAccount(account);
		
		
		Transaction txn = session.getTransaction();
		txn.begin();
		
		session.save(employee);
		
		txn.commit();
		
		System.out.println("employee saved along with account details.");
		
		session.close();
		factory.close();
	}

}
