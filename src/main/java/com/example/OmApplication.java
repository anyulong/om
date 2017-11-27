package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.pojo.Person;


import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class OmApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmApplication.class, args);
	}
	@Bean
	public com.fasterxml.jackson.databind.ObjectMapper objectMapper() {
		com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
		return objectMapper;
	}
	
	@Autowired
	ObjectMapper mapper;
	
	
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			Person person = new Person();
			System.out.println(mapper.writeValueAsString(person));
			System.out.println(mapper.readValue(mapper.writeValueAsString(person), Person.class));
		};
	}

}
