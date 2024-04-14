package com.greatlearning.employeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.greatlearning.employeeManagementSystem.entity.User;



public interface UserJpaRepository extends JpaRepository<User, Long> {
	
	public User getUserByUsername(String username);
}
