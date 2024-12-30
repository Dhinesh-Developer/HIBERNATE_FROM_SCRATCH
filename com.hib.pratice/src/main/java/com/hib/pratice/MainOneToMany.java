package com.hib.pratice;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class MainOneToMany {

    private static String OrdersEntity;

	public static void main(String[] args) {
        Session session = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(StudentEntity.class)
                .addAnnotatedClass(StudentDetails.class)
                .addAnnotatedClass(OrdersEntity.class)
                .buildSessionFactory()
                .openSession();

        try {
            session.beginTransaction();

           /* inserting the data.
            *  StudentEntity student = new StudentEntity("Ragu", "ragu@gmail.com", "Real Estate", 187965);
            StudentDetails details = new StudentDetails("Ragu", "Gandhi Nagar");
            OrdersEntity order = new OrdersEntity("Order1", 987132);

            student.setStudentDetails(details);
            order.setStudent(student);

            session.persist(student);
            session.persist(order);

            session.getTransaction().commit();
            System.out.println("Data inserted successfully!");
            */
            // Display the data.
            StudentEntity se = session.get(StudentEntity.class, 52);
            System.out.println(se.getsId()+" "+se.getsName()+" "+se.getsDesig()+" "
            		+se.getsEmail()+" "+se.getsSalary());
            
            StudentDetails sd = session.get(StudentDetails.class, 1);
            System.out.println(sd.getSdId()+" "+sd.getSdName()+" "+sd.getSdArea());
            
           
            
        } finally {
            session.close();
        }
    }
}
