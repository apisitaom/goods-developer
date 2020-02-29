package com.example.demo.repositories;

import com.example.demo.entities.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ShippingRepository extends JpaRepository<Shipping, Long> {}