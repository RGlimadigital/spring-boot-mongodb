package com.example.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;

@RestController
@RequestMapping(value  = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria", "maria@gmail.com");
		User jose = new User("2", "Jose", "jose@gmail.com");
		User joao = new User("3", "Joao", "joao@gmail.com");
		
		List<User> usuarios = new ArrayList<>();
		
		usuarios.addAll(Arrays.asList(maria, jose, joao));
		
		return ResponseEntity.ok().body(usuarios);
	}

}
