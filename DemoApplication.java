package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {

	@RequestMapping("/")
	public String getName() {
		
		return "jai hanuman";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Jai Hanuman");
	}

}
