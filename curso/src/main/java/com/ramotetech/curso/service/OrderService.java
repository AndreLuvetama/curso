package com.ramotetech.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramotetech.curso.entities.Order;
import com.ramotetech.curso.repositories.OrderRepository;


@Component // registra o componente do springBoot
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
		
	}
	
	public Order findById(Long id) {
		Optional<Order> obj  = repository.findById(id);		
		return obj.get();
	}
}
