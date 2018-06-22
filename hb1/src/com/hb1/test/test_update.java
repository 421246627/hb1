package com.hb1.test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb1.entity.department;

public class test_update {
	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		department d=new department();
		d.setDid(1008);
		d.setDname("学术部");
		d.setUpuid(2018010002);
		d.setUptime(new Date());
		session.update(d);
		transaction.commit();
		session.close();
		sessionfactory.close();
	}
}
