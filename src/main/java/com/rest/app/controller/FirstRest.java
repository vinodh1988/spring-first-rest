package com.rest.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/people")
	public ResponseEntity<Person> addPeople(@RequestBody Person person){
		try {
			service.addPerson(person);
			return new ResponseEntity<Person>(person,HttpStatus.CREATED);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Person>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
