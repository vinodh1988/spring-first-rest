package com.rest.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.app.entity.Person;

public interface PeopleRepository extends JpaRepository<Person, Long>{

}
