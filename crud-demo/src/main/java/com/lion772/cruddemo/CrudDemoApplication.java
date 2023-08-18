package com.lion772.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	// This little snippet of code will be executed after the beans have been loaded
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {

		//Java lambda expression -> shorthand notation for creating an implementation for CommandLineRunner
		return runner -> {
			System.out.println("Hello World");
		};
	}

}
