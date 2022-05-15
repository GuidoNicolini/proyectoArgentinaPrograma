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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bargpro.dao.UsuarioDAO;
import com.bargpro.entities.DatosUsuario;
import com.bargpro.entities.Estudio;
import com.bargpro.entities.Experiencia;
import com.bargpro.entities.Habilidad;
import com.bargpro.entities.ImagenProyecto;
import com.bargpro.entities.Proyecto;
import com.bargpro.entities.RedSocial;
import com.bargpro.entities.Usuario;
import com.bargpro.services.CreacionDePerfilPropio;

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


	@GetMapping("/test")
	@Transactional
	public void agregarTest() {
		
	
			
			
			Usuario usuario = new Usuario();
			
			DatosUsuario du = new DatosUsuario();

			
			du.setNombre("Jamiz");
			du.setApellido("Inmortal");
			
			em.persist(du);
			
			usuario.setDatosUsuario(du);
			
			
			
			em.persist(usuario);
			
		
	}

}
