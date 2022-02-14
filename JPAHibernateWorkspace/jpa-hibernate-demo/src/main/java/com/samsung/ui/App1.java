package com.samsung.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.samsung.entity.AdbSubscriber;
import com.samsung.entity.ContactDetails;
import com.samsung.util.JpaUtil;

public class App1 {

	public static void main(String[] args) {

		ContactDetails cd = new ContactDetails();
		cd.setMobileNumber("1234567890");
		cd.setEmailId("radha@gmail.com");
		cd.setAddressLine1("t.nager");
		cd.setAddressLine2("10-11/A");
		cd.setCity("chennai");
		cd.setState("tamil nadu");
		
		
		AdbSubscriber u = new AdbSubscriber();
		u.setFirst_name("radha");
		u.setLast_name("jain");
		u.setSubscriberContactDetails(cd);
		
		
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(u);
		txn.commit();
		em.close();
	}
}
