package com.example.demo.controllers;

import java.util.List;  
import com.example.demo.entities.Seller;
import com.example.demo.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seller")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class SellerController {
    @Autowired
    private SellerRepository sellerRepository;

    @GetMapping("/lists")
    public List<Seller> getSellers() {
        return sellerRepository.findAll();
    }
}