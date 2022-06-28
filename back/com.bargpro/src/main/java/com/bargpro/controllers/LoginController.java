package com.bargpro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bargpro.dao.UsuarioDAO;
import com.bargpro.entities.User;


@Secured("ROLE_ADMIN")
@RequestMapping("Logger")
public class LoginController {
	
	
	@Autowired
	private UsuarioDAO dao;

	@PostMapping("/user")
	@Transactional
	public void crearUser(@RequestBody User user) {
		
		dao.guardarUser(user);
		
	}
	
}
