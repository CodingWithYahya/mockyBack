package com.mockyBack.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.mockyBack.demo.repositories")
@SpringBootApplication
public class MockyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockyBackendApplication.class, args);
	}

}
