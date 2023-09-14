package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/user-details")
	UserDetails getUserDetails() {
		return new UserDetails("Sathwik", "Ameenabada", "tony@gmail.com");
	}

}
