package com.rest.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.app.entity.Person;

public interface PeopleRepository extends JpaRepository<Person, Long>{
 
}
