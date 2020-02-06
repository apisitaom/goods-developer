package com.example.demo.controllers;
import java.util.Optional;
import java.util.List;  
import com.example.demo.entities.User;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
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

    @PutMapping("/edit/{id}")
    public ResponseEntity<Object> editUserEntity(@RequestBody User user, @PathVariable Long id){
        Optional<User> userOptional = userRepository.findById(id);
        if(!userOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }
        user.setId(id);
        userRepository.save(user);

        return ResponseEntity.ok("EDIT USER ID: "+id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return true;
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
