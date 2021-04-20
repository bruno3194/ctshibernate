package com.cts.hibernatedemo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.hibernatedemo.entity.Address;
import com.cts.hibernatedemo.entity.Employee;
import com.cts.hibernatedemo.entity.Student;

public class EmployeeComponentDemo {

	public static void main(String[] args) {

Address address = new Address("1-2-3","city1",12345);
		Employee employee = new Employee(1001,"emp1",23,"M");
		employee.setAddress(address);
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(employee);
		transaction.commit();
		session.close(); 

		
	}

}
