package com.hib.pratice;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LazyLoading {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(StudentEntity.class).addAnnotatedClass(StudentDetails.class).
				buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		StudentEntity se = session.get(StudentEntity.class, 52);
		StudentDetails sd = session.get(StudentDetails.class, 1);
		session.persist(se);
		session.persist(sd);
		session.getTransaction().commit();
	}

}
