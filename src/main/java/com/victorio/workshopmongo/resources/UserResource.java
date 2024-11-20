package com.victorio.workshopmongo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victorio.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User vitor = new User("1", "Vitor Corleone", "corleone@gmail.com");
		List<User> users = new ArrayList<>();
		users.add(vitor);
		return ResponseEntity.ok().body(users);
	}

}
