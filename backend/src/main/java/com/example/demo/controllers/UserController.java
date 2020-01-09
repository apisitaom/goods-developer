package com.example.demo.controllers;
import java.util.Optional;
import java.util.List;  
import com.example.demo.entities.User;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {
    @Autowired 
    private UserRepository userRepository;

    @GetMapping("/lists")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public User getUserById(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return true;
    }

    @PutMapping("/edit")
    public User updateUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
