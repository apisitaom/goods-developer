package com.example.demo.controllers;

import java.util.List;  
import com.example.demo.entities.Admin;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/lists")
    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }
    
}