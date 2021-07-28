package com.rest.app.repository;
import org.springframework.data.repository.CrudRepository;

import com.rest.app.entity.Users;

public interface UsersDAO extends CrudRepository<Users,Long>{
  Users findUsersByUsername(String username);
}