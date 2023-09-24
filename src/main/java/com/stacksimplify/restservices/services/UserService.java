package com.stacksimplify.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.User;
import com.stacksimplify.restservices.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public String createUser(User user) {
		return "User created " + userRepository.save(user);
	}
	
	public Optional<User> getUserById(Long Id) {
		return userRepository.findById(Id);
	}
	
	public User findUserByUsername(String username) {
		return userRepository.findUserByUsername(username);
	}
	
	public User updateUserById(Long id, User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	public String deleteUserById(Long id) {
		userRepository.deleteById(id);
		return "deleted user with details ";
	}
}
