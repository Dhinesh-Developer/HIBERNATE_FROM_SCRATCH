package com.hib.pratice;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;



public class MainMethods {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(StudentEntity.class)
				.buildSessionFactory().openSession();
		
		//Inserting the data.
		 StudentEntity se = new StudentEntity("ram","ram@gmail.com","student",40000);
		session.beginTransaction();
		session.persist(se);
		session.getTransaction().commit();
		System.out.println("Data inserted");
		 
		
		
		/*
		 // fetching all the query
		 Query query = session.createQuery("FROM student",StudentEntity.class);
		List<StudentEntity> student = query.list();
		for(StudentEntity x:student) {
			System.out.println(x);
		}
		 */
		 
		/* 
		// updating the salary
		 StudentEntity se = session.get(StudentEntity.class, 2);
		se.setsSalary(1410031);
		session.update(se);
		session.beginTransaction();
		session.getTransaction().commit();
		System.out.println("Data updated in salary");
		 */
		
		 /*
		//updating the role
		StudentEntity se = session.get(StudentEntity.class, 52);
		se.setsDesig("King");
		session.update(se);
		session.beginTransaction();
		session.getTransaction().commit();
		System.out.println("Data updated in the Degination");
		 */
		
		/*
		// Deleting the record.
		 
		StudentEntity se = session.get(StudentEntity.class, 2);
		session.delete(se);
		session.beginTransaction();
		session.getTransaction().commit();
		System.out.println("Data deleted");
		*/ 
	}

}
