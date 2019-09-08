package com.cloud.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.dto.UserDto;
import com.cloud.model.User;
import com.cloud.service.UserService;

@RestController
@RequestMapping("/userResource")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "login", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	UserDto login(String name, String password) {
		return userService.login(name, password); 
	}
	
}
