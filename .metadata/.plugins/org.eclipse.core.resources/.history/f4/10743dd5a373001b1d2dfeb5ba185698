package com.ramotetech.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramotetech.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Maria", "maria@hotmail.com" , "119073636", "1239383");
		
		return ResponseEntity.ok().body(u);
		
	}
	
}
