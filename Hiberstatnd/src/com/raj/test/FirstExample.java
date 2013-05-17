package com.raj.test;

import org.hibernate.Session;

/**
 * @author Nagaraju V
 * Hibernate example to inset data into Contact table
 */
public class FirstExample {
	public static void main(String[] args) {

		System.out.println("In Main--->");
		Session session = HibernateUtil.getSession();
		Contact contact = new Contact();
		contact.setId(3);
		contact.setFirstName("Naga");
		contact.setLastName("vee");
		contact.setEmail("raj_veer@gmail.com");
		session.save(contact);
		session.beginTransaction().commit();

		System.out.println("Record Inserted Sucessfully");
		session.close();
	}
}