package com.cts.hibernatedemo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.hibernatedemo.entity.Student;

public class StudentStateDemo {

	public static void main(String[] args) {

//		Student s =  new Student(1006,"stu6",23,"Male"); // Transient
//		System.out.println(s); 
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s1 = (Student) session.get(Student.class, 1006);
		System.out.println(s1);//persistent // stu4 stu4 
	
		session.evict(s1);
		session.clear();
		
//		s1.setStudentName("student4");
		
		Student s2 = (Student) session.get(Student.class, 1006);
		System.out.println(s2);//persistent
//		session.delete(s1);
		transaction.commit();
		session.close(); // student4 student4
		// Dirty read - compares the object of cache with db. 
//		if there are changes mades it will updates
		
		s1.setStudentName("s4"); //db-student4 obj-s4
		System.out.println(s1); // Detached State
		
	}

}
//Student student1 = (Student) session.load(Student.class, 1007);
//System.out.println(student1);
// save() or persist()
// delete()
// update()
// get() or load()
// saveorupdate() and merge()
