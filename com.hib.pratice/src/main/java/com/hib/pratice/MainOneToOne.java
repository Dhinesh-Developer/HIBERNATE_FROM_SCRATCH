package com.hib.pratice;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class MainOneToOne {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentEntity.class)
				.addAnnotatedClass(StudentDetails.class)
				.buildSessionFactory().openSession();
		StudentEntity se = new StudentEntity("Jadeja","jadeja@gmail.com","HR",897143);
		StudentDetails sd = new StudentDetails("jadeja","BTM");
		
		session.beginTransaction();
		session.persist(sd);
		session.getTransaction().commit();
		System.out.println("Data inserted");
	}

}
