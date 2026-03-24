package com.jarvis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarvis.dto.UserDTO;
import com.jarvis.model.User;
import com.jarvis.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping
	public User create(@Valid @RequestBody UserDTO dto) {
		return service.createUser(dto);
	}
	@GetMapping
	public List<User> getAll(){
		return service.getAllUsers();
	}
	

}
