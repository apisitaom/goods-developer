package com.example.demo.repositories;

import com.example.demo.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface AddressRepository extends JpaRepository<Address, Long> {}