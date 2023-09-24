package com.stacksimplify.restservices.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.stacksimplify.restservices.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findUserByUsername(String username);
}
