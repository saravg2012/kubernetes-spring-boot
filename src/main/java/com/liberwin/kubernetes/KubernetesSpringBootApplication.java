package com.liberwin.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(KubernetesSpringBootApplication.class, args);
		System.out.println("Hello branch2");

	}


	@GetMapping("/message")
	public String getMessage() {

		return "Welcome to Tech Primes !!";
	}



}
