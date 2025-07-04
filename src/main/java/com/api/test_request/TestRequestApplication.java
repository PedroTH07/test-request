package com.api.test_request;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication @EnableScheduling
public class TestRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRequestApplication.class, args);
	}

}
