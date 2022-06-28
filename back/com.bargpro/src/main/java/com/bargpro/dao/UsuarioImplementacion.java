package com.bargpro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bargpro.entities.DatosUsuario;
import com.bargpro.entities.Proyecto;
import com.bargpro.entities.User;
import com.bargpro.entities.Usuario;
import com.bargpro.services.Utilidades;

@Repository
@Transactional
public class UsuarioImplementacion implements UsuarioDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Transactional
	@Override
	public List<Usuario> getListaUsuarios() {

		String query = "FROM Usuario";
		List<Usuario> listaUsuarios = em.createQuery(query).getResultList();

		return listaUsuarios;
	}

	@Override
	@Transactional
	public Usuario getUsuario(Integer id) {

		return em.find(Usuario.class, id);
	}

	@Override
	@Transactional
	public void guardarUsuario(Usuario usuario) {

		em.persist(usuario);

	}

	@Override
	@Transactional
	public void modificarUsuario(Usuario usuario) {
		
		Utilidades.setearUsuarioEnAtributosDependientes(usuario);
		em.merge(usuario);

	}

	@Override
	@Transactional
	public Proyecto getProyecto(Integer id) {
		
		return em.find(Proyecto.class, id);
		
	}

	@Override
	@Transactional
	public void modificarImagenProyectoUsuario(Proyecto proyecto) {
	
		em.merge(proyecto);
		
	}
	
	@Override
	@Transactional
	public void guardarUser(User user) {

		String contra = passwordEncoder.encode(user.getPassword());
		
		
		user.setPassword(contra);
		
		
		
		
		em.persist(user);

	}

}
