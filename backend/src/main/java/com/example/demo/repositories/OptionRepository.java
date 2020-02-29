package com.example.demo.repositories;

import com.example.demo.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface OptionRepository extends JpaRepository<Option, Long>{}