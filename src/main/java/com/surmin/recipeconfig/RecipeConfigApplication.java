package com.surmin.recipeconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RecipeConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeConfigApplication.class, args);
	}

}
