package com.cts.hibernatedemo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.hibernatedemo.entity.Student;

public class StudentCrudDemo {

	public static void main(String[] args) {
		//Read the configuration XML
//		Student student1 = new Student(1001,"stu1",22,"Male");
//		Student student2 = new Student(1002,"stu2",23,"FeMale");
//		Student student3 = new Student(1003,"stu3",22,"Male");
//		Student student4 = new Student(1004,"stu4",23,"Male");
//		Student student5 = new Student(1005,"student5",23,"FeMale");
//		Student student6 = new Student(1006,"stu6",22,"FeMale");
//		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Connection pool. Factory of connection objects
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
        // One Database connection object //Using this connection Object I can perform CRUD operations
		Session session = sessionFactory.openSession();
		//Transaction is must to save the data permanently
		Transaction transaction = session.beginTransaction();
		//  CRUD 1.Insert
//		    session.save(student2); // converted the object in db format and then query is also generated
//		    session.save(student3);
//		    session.save(student4);
//		    session.save(student5);
//		    session.save(student6);
//		    session.save(student1);
//		    2.delete
//		    session.delete(student6);
//		    3.Update
//		    session.update(student5);
//		    4. Select
		    Student stu = (Student)session.load(Student.class, 1004);
		    System.out.println(stu);
		//1. Commit or Rollback    
		
		
		transaction.commit();
		//Connection closed
		session.close();

	}

}
