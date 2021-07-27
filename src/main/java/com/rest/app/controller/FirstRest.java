package com.rest.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstRest {
	
	@GetMapping("/hello")
	public String first() {
		return "Hello!!! Spring boot is running";
	}

}
