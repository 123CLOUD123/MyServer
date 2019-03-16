package com.cloud.MyServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
//@SpringBootApplication
public class App {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello spring boot!";
	}
	
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
