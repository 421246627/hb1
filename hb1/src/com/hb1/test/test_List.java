package com.hb1.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb1.entity.department;

public class test_List {
	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from department");
		List <department> list=query.list();
		for(department d:list)
		{
			System.out.println(d.toString());
		}
		session.close();
		sessionfactory.close();
	}
}
