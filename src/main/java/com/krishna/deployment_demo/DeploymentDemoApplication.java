package com.krishna.deployment_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DeploymentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentDemoApplication.class, args);
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok("Welcome to deployment demo!");
	}

}
