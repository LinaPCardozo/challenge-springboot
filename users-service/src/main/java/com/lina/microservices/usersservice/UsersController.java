package com.lina.microservices.usersservice;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lina.microservices.usersservice.bean.User;

@RestController
public class UsersController {

	private Logger logger = LoggerFactory.getLogger(User.class);
	
	@Autowired
	private UsersRepository repository;
	
	@Autowired
	private UsersProxy proxy;
	
	@GetMapping("/users")
	public List<User> retrieveUsers() throws Exception {

		logger.info("retrieveUsers called");
		
		List<User> users = proxy.getUsers();
		saveUsers(users);
		
		return users;
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<Object> retrieveUser(@PathVariable int id) throws Exception {

		logger.info("retrieveUser called with id {}", id);
		
		Optional<User> user = repository.findById(id);
		
		if (!user.isPresent())
			return new ResponseEntity<Object>("The user with id " + id + " was not found.", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}
	
	@Async("processExecutor")
	public void saveUsers(List<User> users) {
		
		/*
		try {
			repository.saveAll(users);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		new Thread(new Runnable() {
            public void run()
            {
            	repository.saveAll(users);
            }
        }).start();
	}

}
