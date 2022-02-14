package com.samsung.ui;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.samsung.entity.Job;

public class App4 {

	public static void main(String[] args) {
		// step-1: create the configuration object
		// this info is needed to create the session factory
		Configuration conf = new Configuration().configure();
		conf.addAnnotatedClass(Job.class);
		
		// step-2: build the session factory using configuration object	-	it is like a Connection Pool in jdbc
		SessionFactory factory = conf.buildSessionFactory();
		
		// step-3: get session from session factory - it is like a Connection in jdbc
		Session session = factory.openSession();
		
	
		// TypedQuery<Job> query = session.createQuery("from Job j", Job.class);		// HQL
		// TypedQuery<Job> query = session.createQuery("from Job j WHERE j.minSalary >= 10000", Job.class);		// HQL
		TypedQuery<Job> query = session.createQuery("from Job j ORDER BY j.jobTitle", Job.class);		// HQL
		List<Job> jobs = query.getResultList();
		for(Job j : jobs) {
			System.out.println(j);
		}
		
		session.close();
		factory.close();
	}

}
