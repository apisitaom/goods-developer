package com.example.demo.repositories;

import com.example.demo.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface PaymentRepository extends JpaRepository<Payment, Long> {}