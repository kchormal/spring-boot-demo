package com.example.deva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan(basePackages = "com.example.deva")
public class DevaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevaApplication.class, args);
	}

}
