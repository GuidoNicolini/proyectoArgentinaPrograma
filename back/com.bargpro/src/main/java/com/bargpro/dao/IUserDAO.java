package com.bargpro.dao;

import org.springframework.data.repository.CrudRepository;

import com.bargpro.entities.User;



public interface IUserDAO extends CrudRepository<User, Long>{

	public User findByUsername(String username);
	
}
