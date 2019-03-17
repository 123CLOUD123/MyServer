package com.cloud.dao.impl;

import java.util.List;

import org.hibernate.Query;

import org.springframework.stereotype.Component;

import com.cloud.dao.UserDao;
import com.cloud.model.User;
import com.cloud.util.BaseDao;

@Component
public class UserDaoImpl extends BaseDao implements UserDao  {

	@Override
	public List<User> query(String name, String password) {
		String hql ="FROM " + User.class.getName() + " WHERE name = :name AND password = :password";
		Query query = createQuery(hql);
		query.setParameter("name", name);
		query.setParameter("password", password);
		return query.list();
	}

}
