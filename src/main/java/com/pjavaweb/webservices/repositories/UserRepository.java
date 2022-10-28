package com.pjavaweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjavaweb.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
