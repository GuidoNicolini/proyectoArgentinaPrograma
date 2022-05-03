package com.bargpro.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bargpro.dao.UsuarioDAO;
import com.bargpro.entities.Usuario;

@RestController
@RequestMapping("api")
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;

	@PersistenceContext
	private EntityManager em;

	@GetMapping("/usuarios")
	@Transactional
	public List<Usuario> getUsuarios() {

		return dao.getListaUsuarios();

	}

	@GetMapping("/usuario/{id}")
	@Transactional
	public Usuario getUsuario(@PathVariable Integer id) {

		return dao.getUsuario(id);

	}

}
