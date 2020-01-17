package com.example.demo;

import com.example.demo.repositories.*;
import java.util.Date;
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
	ApplicationRunner init(UserRepository userRepository, AdminRepository adminRepository,
						   SellerRepository sellerRepository) {
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

			Seller seller = new Seller();
			seller.setSellername("Yamaha");
			seller.setEmail("email@email.com");
			seller.setPassword("password");
			seller.setPhonenumber("0930019043");
			seller.setAge(32);
			seller.setAddress("Country Thailand Postcode 30000");
			seller.setPromtpay("093347977");
			seller.setFacebook("aom apisit");
			seller.setLine("idline");
			seller.setDetail("Sell 3 years. on BKK");
			seller.setStatue(true);
			Date date = new Date(2017-03-03);
			seller.setDatestart(date);
			sellerRepository.save(seller);

		};
	}
}
