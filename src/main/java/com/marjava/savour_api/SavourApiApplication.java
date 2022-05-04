package com.marjava.savour_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SavourApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavourApiApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "SavourAPI says Hello!";
	}
}
