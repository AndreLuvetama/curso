package com.ramotetech.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramotetech.curso.entities.User;
import com.ramotetech.curso.repositories.UserRepository;

@Component // registra o componente do springBoot
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	
	public User findById(Long id) {
		Optional<User> obj  = repository.findById(id);		
		return obj.get();
	}
	public User insert(User obj) {
		return repository.save(obj);
	}
}
