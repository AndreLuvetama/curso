package com.ramotetech.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramotetech.curso.entities.Category;

import com.ramotetech.curso.repositories.CategoryRepository;


@Component // registra o componente do springBoot
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
		
	}
	
	public Category findById(Long id) {
		Optional<Category> obj  = repository.findById(id);		
		return obj.get();
	}
}