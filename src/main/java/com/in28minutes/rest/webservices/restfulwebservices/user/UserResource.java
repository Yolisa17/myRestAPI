package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;
	
	//Retrieve all Users
	@GetMapping("/users")
	public List<User> retreiveAllUsers()
	{
		return service.FindAll();
	}
	
	//Get user/{id}
	@GetMapping("/users/{paId}")
	public User getUserbyId(@PathVariable int paId)
	{
		User foundUser = service.findOne(paId);
		if(foundUser==null)
			throw new UserNotFoundException("paId-"+paId);
		
		return foundUser;
	}
	
	@PostMapping("/users/createUser")
	public User createUserEasy(@RequestBody User user)
	{
		User newUser = service.saveUser(user);
		return newUser;
	}	
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user)
	{
		User newUser = service.saveUser(user);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(newUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
