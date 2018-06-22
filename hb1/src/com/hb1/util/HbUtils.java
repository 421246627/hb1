package com.hb1.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb1.entity.department;

public class HbUtils {
	@SuppressWarnings("deprecation")
	public static Session getSession()
	{
		return new Configuration().configure().buildSessionFactory().openSession();
	}
	@SuppressWarnings("unchecked")
	public static <T> T get(Class<T>clazz,Serializable id) throws InstantiationException, IllegalAccessException
	{
		Session session=getSession();
		T instance=clazz.newInstance();
		instance=(T) session.get(clazz,id);
		session.close();
		return instance;
	}
	public static Serializable save(Object obj)
	{
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Serializable sz = session.save(obj);
		transaction.commit();
		session.close();
		return sz;
	}
	public static void update(Object obj)
	{
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(obj);
		transaction.commit();
		session.close();
	}
	public static void delete(Object obj)
	{
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.delete(obj);
		transaction.commit();
		session.close();
	}
	@SuppressWarnings("unchecked")
	public static List query(String hql)
	{
		Session session=getSession();
		Query query=session.createQuery(hql);
		List list=query.list();
		session.close();
		return list;
	}
}
