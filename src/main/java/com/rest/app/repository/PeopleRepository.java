package com.rest.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rest.app.entity.Person;

public interface PeopleRepository extends JpaRepository<Person, Long>{
   public List<Person> findByCity(String city);
   
   @Query("from Person p where sno between :start and :end")
   public List<Person> findBetween(@Param("start") int start,@Param("end")int end);
}
