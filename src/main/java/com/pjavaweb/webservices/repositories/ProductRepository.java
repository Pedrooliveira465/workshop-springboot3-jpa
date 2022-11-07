package com.pjavaweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjavaweb.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
