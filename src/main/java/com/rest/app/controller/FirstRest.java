package com.rest.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.app.entity.Person;
import com.rest.app.service.PeopleService;

@RestController
@RequestMapping("/api")
public class FirstRest {
	@Autowired
	PeopleService service;
	@GetMapping("/hello")
	public String first() {
		return "Hello!!! Spring boot is running";
	}
	
	@GetMapping("/people")
	public List<Person> getPeople(){
		return service.getPeople();
	}

}
