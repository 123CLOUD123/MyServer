package com.cloud.util;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	protected Query createQuery(String hql) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query query = session.createQuery(hql);
		return query;
	}
}
