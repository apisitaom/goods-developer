package com.example.test.controllers;

import com.example.test.entities.Admin;
import com.example.test.repositories.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/lists")
    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }
    @GetMapping("/list/{id}")
    private AdminRepository getAdminById(@PathVariable Long id) {
        return (AdminRepository) this.adminRepository.findById(id).get();
    }
    @PostMapping("/add")
    public Admin addAdmin(@RequestBody Admin email) {
        return adminRepository.save(email);
    }
    @PutMapping("/edit")
    public Admin editAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteAdmin(@PathVariable Long id) {
        adminRepository.deleteById(id); 
        return true;
    }
    
    
    
}