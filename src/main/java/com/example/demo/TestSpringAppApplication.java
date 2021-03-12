package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@SpringBootApplication
public class TestSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringAppApplication.class, args);
	}
}
