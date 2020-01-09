package com.example.test;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.test.entities.*;
import com.example.test.repositories.*;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	@Bean
	ApplicationRunner init(AdminRepository adminRepository ) {
		return arge -> {
			Admin admin = new Admin();
			admin.setEmail("apisitprompha@gmail.com");
			admin.setPassword("password");
			adminRepository.save(admin);
		};
	}

}
