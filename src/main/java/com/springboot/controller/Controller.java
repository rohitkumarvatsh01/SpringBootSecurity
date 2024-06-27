package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
//@RequestMapping("/api")
public class Controller {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to Home Page";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome to Admin Page";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Welcome to User Page";
	}

}
