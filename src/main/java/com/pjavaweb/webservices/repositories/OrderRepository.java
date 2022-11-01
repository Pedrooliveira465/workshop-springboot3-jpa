package com.pjavaweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjavaweb.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
