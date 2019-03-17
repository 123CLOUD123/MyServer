package com.cloud.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	
	@RequestMapping("/tong")
	String tong() {
		return "hello tong";
	}
	
	@RequestMapping("/test")
	String hao() {
		return null;
	}
}
