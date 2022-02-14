package com.samsung.ui;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.samsung.entity.Job;

public class App5 {

	public static void main(String[] args) {
		// step-1: create the configuration object
		// this info is needed to create the session factory
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		conf.addAnnotatedClass(Job.class);
		
		// step-2: build the session factory using configuration object	-	it is like a Connection Pool in jdbc
		SessionFactory factory = conf.buildSessionFactory();
		
		// step-3: get session from session factory - it is like a Connection in jdbc
		Session session = factory.openSession();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Job> cr = cb.createQuery(Job.class);
		Root<Job> root = cr.from(Job.class);
		cr.select(root);

		TypedQuery<Job> query = session.createQuery(cr);
		List<Job> results = query.getResultList();
		results.forEach(System.out::println);
		
		System.out.println("----------------------------------------------------");
		
		cr.select(root).where(cb.gt(root.get("minSalary"), 25000));
		TypedQuery<Job> query2 = session.createQuery(cr);
		List<Job> results2 = query2.getResultList();
		results2.forEach(System.out::println);
		
		System.out.println("----------------------------------------------------");
		
		cr.select(root).where(cb.like(root.get("jobId"), "SA%"));
		TypedQuery<Job> query3 = session.createQuery(cr);
		List<Job> results3 = query3.getResultList();
		results3.forEach(System.out::println);
		
		System.out.println("----------------------------------------------------");
		
		
		
		session.close();
		factory.close();
	}

}
