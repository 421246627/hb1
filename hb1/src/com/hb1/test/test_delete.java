package com.hb1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb1.entity.department;

public class test_delete {
	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction =session.beginTransaction();
		department d=new department();
		d.setDid(1008);
		session.delete(d);
		transaction.commit();
		session.close();
		sessionfactory.close();
	}
}
