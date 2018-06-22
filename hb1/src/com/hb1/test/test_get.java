package com.hb1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb1.entity.department;

public class test_get {
	public static void main(String[] args) {
		//1.创建Configuration对象
		Configuration config=new Configuration().configure();//解析xml文件,创建Configuration对象
		//2.初始化Configuration
		SessionFactory sessionfactory=config.buildSessionFactory();
		//3.创建Session
		Session session=sessionfactory.openSession();
		//4.执行持久化操作
		department d=(department) session.get(department.class,1007);
		System.out.println(d.toString());
		//5.关闭
		session.close();
		sessionfactory.close();
	}
}
