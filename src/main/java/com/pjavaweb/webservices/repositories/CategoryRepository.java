package com.pjavaweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjavaweb.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
