package com.bargpro.controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bargpro.dao.UsuarioDAO;
import com.bargpro.entities.Proyecto;

import com.bargpro.entities.Usuario;


@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:4200/")
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

	@GetMapping("/usuarios/{id}")
	@Transactional
	public Usuario getUsuario(@PathVariable Integer id) {

		return dao.getUsuario(id);

	}
	
	
	@PostMapping("/usuarios")
	@Transactional
	public void crearUsuario(@RequestBody Usuario usuario) {
		
		dao.guardarUsuario(usuario);
		
	}

	@PatchMapping("usuarios")
	@Transactional
	public void modificarDatos(@RequestBody Usuario usuario) {
		
		dao.modificarUsuario(usuario);

	}
	

@PatchMapping("/proyectos")
	@Transactional
	public void modificarImagenProyecto(@RequestBody Proyecto proyecto) {

		dao.modificarImagenProyectoUsuario(proyecto);

	}

	@GetMapping("/proyectos/{id}")
	@Transactional
	public Proyecto getProyecto(@PathVariable Integer id) {

		return dao.getProyecto(id);

	}


}


