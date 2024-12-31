package com.hib.pratice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		Session session  = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(EmployeeEntity.class).addAnnotatedClass(ProjectEntity.class)
				.buildSessionFactory().openSession();
		/*Inserting the data
		EmployeeEntity e = new EmployeeEntity("virat","cricket");
		ProjectEntity p = new ProjectEntity("IPL");
		session.beginTransaction();
		session.persist(e);
		session.persist(p);
		session.getTransaction().commit();
		System.out.println("Data inserted");
		 */
			ArrayList<EmployeeEntity> e = new ArrayList<EmployeeEntity>();
			ArrayList<ProjectEntity> p = new ArrayList<ProjectEntity>();
			
		/* Display the data.
		 * 	EmployeeEntity ee = session.get(EmployeeEntity.class,1);
			System.out.println(ee.geteId()+" "+ee.geteName()+" "+ee.geteDept());
			
			List<ProjectEntity> pe = ee.getProjects();
			for(ProjectEntity x : pe) System.out.print(x+" ");
		 */
	}

}
