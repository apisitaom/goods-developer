package com.example.demo.controllers;

import java.net.URI;
import java.util.List;  
import java.util.Optional;
import com.example.demo.entities.Seller;
import com.example.demo.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/seller")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class SellerController {
    @Autowired
    private SellerRepository sellerRepository;

    @GetMapping("/lists")
    public List<Seller> getSellers() {
        return sellerRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public Seller getSellerById(@PathVariable Long id) {
        Optional<Seller> seller = sellerRepository.findById(id);
        return seller.get(); 
    }

    @PostMapping("/add")
    public ResponseEntity<Object> createSeEntity(@RequestBody Seller seller){
        Seller saveSeller = sellerRepository.save(seller);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveSeller.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSellerById(@PathVariable Long id){
        sellerRepository.deleteById(id);
    }
    
    @PutMapping("/edit/{id}")
    public ResponseEntity<Object> editSelleEntity(@RequestBody Seller seller, @PathVariable Long id){
        Optional<Seller> sellerOptional = sellerRepository.findById(id);
        if(!sellerOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }
        seller.setId(id);
        sellerRepository.save(seller);

        return ResponseEntity.ok("EDIT SELLER ID: "+id);
    }
    
}