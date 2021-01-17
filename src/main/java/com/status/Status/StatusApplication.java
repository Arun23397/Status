package com.status.Status;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatusApplication.class, args);
	}
}
