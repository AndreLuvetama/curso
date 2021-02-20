package com.ramotetech.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramotetech.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
