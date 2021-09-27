package com.lina.microservices.usersservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lina.microservices.usersservice.bean.User;

@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {}
