package com.jarvis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarvis.dto.UserDTO;
import com.jarvis.model.User;
import com.jarvis.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public User createUser(UserDTO dto) {
		User user =new User();
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setRole(dto.getRole());
		
		return userRepo.save(user);
	}
	/*
	 * public User createUser(User user) { return userRepo.save(user); }
	 */

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
}
