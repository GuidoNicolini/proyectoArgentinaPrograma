package com.bargpro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bargpro.entities.Usuario;

@Repository
@Transactional
public class UsuarioImplementacion implements UsuarioDAO {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	@Override
	public List<Usuario> getListaUsuarios() {

		String query = "SELECT a.id , a.datosUsuario.nombre FROM Usuario a";
		List<Usuario> listaUsuarios = em.createQuery(query).getResultList();

		return listaUsuarios;
	}

	@Override
	@Transactional
	public Usuario getUsuario(Integer id) {

		String query = "FROM Usuario a WHERE a.id = " + id;

		Usuario usuario = (Usuario) em.createQuery(query).getSingleResult();

		return usuario;
	}

}
