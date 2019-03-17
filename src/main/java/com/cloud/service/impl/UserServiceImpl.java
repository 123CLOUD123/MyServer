package com.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloud.dao.UserDao;
import com.cloud.dto.UserDto;
import com.cloud.model.User;
import com.cloud.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDto login(String name, String password) {
		List<User> user = userDao.query(name, password);
		UserDto dto = null;
		if (user != null && user.size() > 0) {
			dto = new UserDto();
			dto.setName(user.get(0).getName());
			dto.setPassword(user.get(0).getPassword());
		}
		return dto;
	}

}
