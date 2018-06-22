package com.hb1.test;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb1.entity.department;

public class test_save {
	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		department d = new department();
		d.setDid(1008);
		d.setDname("维修部");
		d.setUpuid(2018010001);
		d.setUptime(new Date());
		Serializable s = session.save(d);//如果添加成功返回主键值,返回类型为序列
		System.out.println(s);
		transaction.commit();
		session.close();
		sessionfactory.close();
	}
}
