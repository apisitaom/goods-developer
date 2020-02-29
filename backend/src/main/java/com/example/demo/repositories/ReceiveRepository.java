package com.example.demo.repositories;

import com.example.demo.entities.Receive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ReceiveRepository extends JpaRepository<Receive, Long> {}