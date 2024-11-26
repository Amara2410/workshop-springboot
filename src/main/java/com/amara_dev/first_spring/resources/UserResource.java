package com.amara_dev.first_spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amara_dev.first_spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource { 
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User (1L, "Yara Amara Sousa Santos", "yara@gmail.com", "999999999", "123456");
		return ResponseEntity.ok().body(u);
	}

}
