package com.cloud.dao;

import java.util.List;

import com.cloud.model.User;

public interface UserDao {
	
	/**
	 *  根据用户名和密码查询
	 *  @author Cloud
	 */
	List<User> query(String name, String password);
	
}
