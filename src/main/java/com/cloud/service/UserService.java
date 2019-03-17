package com.cloud.service;

import com.cloud.dto.UserDto;
import com.cloud.model.User;

public interface UserService {
	
	UserDto login(String name, String password);
	
}
