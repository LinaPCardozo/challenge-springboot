package com.lina.microservices.usersservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lina.microservices.usersservice.bean.User;

@FeignClient(name="users-redis", url="https://jsonplaceholder.typicode.com")
public interface UsersProxy {
	
	@GetMapping("/users")
	public List<User> getUsers();

}