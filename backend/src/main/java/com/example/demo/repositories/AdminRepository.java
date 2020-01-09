package com.example.demo.repositories;

import com.example.demo.entities.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Admin findAdminbyId(Long id);
}