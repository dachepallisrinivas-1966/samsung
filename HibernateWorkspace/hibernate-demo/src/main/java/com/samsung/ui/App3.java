package com.samsung.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samsung.entity.Job;

public class App3 {

	public static void main(String[] args) {
		// step-1: create the configuration object
		// this info is needed to create the session factory
		Configuration conf = new Configuration().configure();
		conf.addAnnotatedClass(Job.class);
		
		// step-2: build the session factory using configuration object	-	it is like a Connection Pool in jdbc
		SessionFactory factory = conf.buildSessionFactory();
		
		// step-3: get session from session factory - it is like a Connection in jdbc
		Session session = factory.openSession();
		
		Job job = session.get(Job.class, "j1");
		if (job == null) {
			System.out.println("job not found");
		} else {
	
			Transaction txn = session.getTransaction();
			txn.begin();
			session.delete(job);
			txn.commit();
			System.out.println("job deleted.");
		}
		
		session.close();
		factory.close();
	}

}
