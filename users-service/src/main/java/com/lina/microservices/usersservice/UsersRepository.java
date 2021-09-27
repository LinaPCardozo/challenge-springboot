package com.lina.microservices.usersservice;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lina.microservices.usersservice.bean.User;

public interface UsersRepository extends MongoRepository<User, Integer> {
	
	public User findByName (String name);

}
