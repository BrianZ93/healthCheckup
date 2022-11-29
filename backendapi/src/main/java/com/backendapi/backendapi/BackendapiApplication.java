package com.backendapi.backendapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendapiApplication.class, args);

		System.out.println("Hello");

		// Initializing ingredients file if one does not exist
		IngredientsREST.createFile(args);
	}

}
