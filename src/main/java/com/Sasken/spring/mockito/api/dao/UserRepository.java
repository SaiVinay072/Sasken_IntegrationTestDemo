package com.Sasken.spring.mockito.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sasken.spring.mockito.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findByAddress(String address);


}
