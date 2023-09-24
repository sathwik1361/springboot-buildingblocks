package com.stacksimplify.restservices.contollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.User;
import com.stacksimplify.restservices.services.UserService;

@RestController
public class UserController {
	
	Optional<User> user1;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/user")
	public String createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long Id) {
		return userService.getUserById(Id);
	}
	
	@GetMapping("/users/byUsername/{username}")
	public User findUserByUsername(@PathVariable("username") String username) {
		return userService.findUserByUsername(username);
	}
	
	@PutMapping("/updateUserById/{id}")
	public String updateUserById(@PathVariable("id") Long id,@RequestBody User user) {
		user1 = userService.getUserById(id);
		return "updated the user with details from " + user1 +" to " + userService.updateUserById(id, user);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable("id") Long id) {
		user1 = userService.getUserById(id);
		return userService.deleteUserById(id)+ user1;
	}
	
	
	
	
	
}
