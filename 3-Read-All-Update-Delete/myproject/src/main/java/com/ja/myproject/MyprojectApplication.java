package com.ja.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyprojectApplication {

	// Acessar "http://localhost:8080" no navegador.
	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}