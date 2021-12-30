package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling 
public class SpringSchedulersExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulersExApplication.class, args);
	}

}
