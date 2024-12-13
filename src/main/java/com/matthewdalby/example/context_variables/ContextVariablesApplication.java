package com.matthewdalby.example.context_variables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.matthewdalby.example.context_variables"})
public class ContextVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContextVariablesApplication.class, args);
	}

}
