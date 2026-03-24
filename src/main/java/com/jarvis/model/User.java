package com.jarvis.model;

import jakarta.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;		
	private String name;
	private String email;
	private String role;

	// 🔥 REQUIRED by Hibernate
	public User() {
	}

	public User(Long id, String name, String email, String role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
	}

	// getters & setters
	public Long getId() { return id; }
	public String getName() { return name; }
	public String getEmail() { return email; }
	public String getRole() { return role; }

	public void setId(Long id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public void setEmail(String email) { this.email = email; }
	public void setRole(String role) { this.role = role; }
}