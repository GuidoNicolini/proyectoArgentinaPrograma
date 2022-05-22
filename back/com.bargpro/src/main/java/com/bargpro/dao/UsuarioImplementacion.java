package com.bargpro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bargpro.entities.DatosUsuario;
import com.bargpro.entities.Usuario;

@Repository
@Transactional
public class UsuarioImplementacion implements UsuarioDAO {

	@PersistenceContext
	private EntityManager em;

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
		em.merge(usuario);

	}

}
