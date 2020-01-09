package com.example.demo.repositories;

import com.example.demo.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestController
public interface UserRepository extends JpaRepository<User, Long> {

}