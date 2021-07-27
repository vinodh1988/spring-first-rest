package com.rest.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.app.entity.Person;
import com.rest.app.repository.PeopleRepository;

@Service
public class PeopleService {
	
	@Autowired
	PeopleRepository prepo;
	
	public List<Person> getPeople(){
		return prepo.findAll();
	}
	
	public void addPerson(Person person) {
		prepo.save(person);
	}

}
