package com.cts.hibernatedemo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.hibernatedemo.entity.Student;

public class StudentGetandLoadDemo {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		// lazy loading . proxy design pattern
//		Student student1 = (Student) session.load(Student.class, 1007);
//		System.out.println(student1);

//		//Eagar loading
		Student student2 = (Student) session.get(Student.class, 1007);
		System.out.println(student2);
		
		transaction.commit();
		session.close();
		
	}

}

// save() or persist()
// delete()
// update()
// get() or load()
// saveorupdate() and merge()
