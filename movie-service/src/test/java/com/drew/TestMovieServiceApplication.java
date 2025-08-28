package com.drew;

import org.springframework.boot.SpringApplication;

public class TestMovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(MovieServiceApplication::main)
                         .with(TestContainersConfiguration.class)
                         .run(args);
	}

}
