package com.example.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstarterApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring");
		SpringApplication.run(SpringstarterApplication.class, args);
	}

}
