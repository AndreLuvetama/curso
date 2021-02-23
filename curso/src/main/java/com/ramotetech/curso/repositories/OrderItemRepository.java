package com.ramotetech.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramotetech.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
