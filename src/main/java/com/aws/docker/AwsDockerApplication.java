package com.aws.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDockerApplication {
	
	@GetMapping("/welcome")
	public String getMsg() {
		return "Welcome to my world";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsDockerApplication.class, args);
	}

}
