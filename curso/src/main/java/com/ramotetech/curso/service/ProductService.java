package com.ramotetech.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.ramotetech.curso.entities.Product;
import com.ramotetech.curso.repositories.ProductRepository;


@Component // registra o componente do springBoot
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
		
	}
	
	public Product findById(Long id) {
		Optional<Product> obj  = repository.findById(id);		
		return obj.get();
	}
}
