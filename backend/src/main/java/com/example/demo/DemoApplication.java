package com.example.demo;

import com.example.demo.repositories.*;
import com.example.demo.entities.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(UserRepository userRepository, AdminRepository adminRepository) {
		return arge -> {
			User user1 = new User();
			user1.setEmail("email@email.com");
			user1.setPhonenumber("0933347977");
			userRepository.save(user1);

			User user2 = new User();
			user2.setEmail("aomty161@hotmail.com");
			user2.setPhonenumber("0930019043");
			userRepository.save(user2);

			Admin admin = new Admin();
			admin.setEmail("email@email.com");
			admin.setPassword("password");
			adminRepository.save(admin);
		};
	}
}
