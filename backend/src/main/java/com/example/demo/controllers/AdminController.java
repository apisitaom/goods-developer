package com.example.demo.controllers;

import java.net.URI;
import java.util.List; 
import java.util.Optional;
import com.example.demo.entities.Admin;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/lists")
    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public Admin getAdminById(@PathVariable Long id){
        Optional<Admin> admin = adminRepository.findById(id);
        return admin.get(); 
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public ResponseEntity<Object> createAdmiEntity(@RequestBody Admin admin){
        Admin saveAdmin = adminRepository.save(admin);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveAdmin.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAdminById(@PathVariable long id){
        adminRepository.deleteById(id);
        return "DELETE ADMIN ID: "+id;
    }
    
    @PutMapping("/edit/{id}")
    public ResponseEntity<Object> editAdmEntity(@RequestBody Admin admin, @PathVariable Long id){
        Optional<Admin> adminOptional = adminRepository.findById(id);
        if(!adminOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }
        admin.setId(id);
        adminRepository.save(admin);
        
        return ResponseEntity.noContent().build();
    }

}