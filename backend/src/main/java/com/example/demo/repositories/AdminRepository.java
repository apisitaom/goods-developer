package com.example.demo.repositories;

import com.example.demo.entities.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestController
public interface AdminRepository extends JpaRepository<Admin, Long> {

}