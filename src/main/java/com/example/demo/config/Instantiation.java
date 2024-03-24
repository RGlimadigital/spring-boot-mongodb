package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.deleteAll();
		
		User rodrigo = new User(null, "Rodrigo Guedes", "rodrigoguedes@mail.com");
		User angela = new User(null, "Angela Frison", "angelaafrison@hotmail.com");
		User alex = new User(null, "Alex Gomez", "alex@gmail.com");
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User bob = new User(null, "Bob Grey", "bobgrey@gmail.com");
		
		repository.saveAll(Arrays.asList(rodrigo, angela, alex, maria, bob));
		
	}

}
