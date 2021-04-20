package com.cts.hibernatedemo.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.hibernatedemo.entity.Passport;
import com.cts.hibernatedemo.entity.Person;

public class PersonPassportOnetoOneDemo {

	public static void main(String[] args) {

//		Person person = new Person(1002,"per2",23,"fm");
//	
//		Passport passport = new Passport(10002,new Date(),"place2");
//		passport.setPerson(person);
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

//		session.save(person);
//		session.save(passport);
		
//		Passport passport1 = (Passport)session.get(Passport.class, 10001); //By default -  Eager Passport + Person
//		System.out.println(passport1.getPerson());
		
		Person person2 = (Person)session.get(Person.class, 1002); //By default -  Eager Passport + Person
//		System.out.println(person2.getPassport().getIssudeDate());
		
        session.delete(person2);
		transaction.commit();
		session.close();

	}

}
