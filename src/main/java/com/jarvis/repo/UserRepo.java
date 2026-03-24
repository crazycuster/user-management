package com.jarvis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarvis.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
