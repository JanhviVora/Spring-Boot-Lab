package com.example.MidTerm626;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan
public class MidTerm626Application {

	public static void main(String[] args) {
		SpringApplication.run(MidTerm626Application.class, args);
	}

}
