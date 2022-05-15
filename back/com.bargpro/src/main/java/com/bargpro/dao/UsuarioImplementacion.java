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

		String query = "FROM Usuario";
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

	@Override
	public void guardarUsuario(Usuario usuario) {

		if (!(usuario.getDatosUsuario() == null)) {
			em.persist(usuario.getDatosUsuario());
		}

		if (!(usuario.getEstudios() == null)) {

			for (int i = 0; i < usuario.getEstudios().size(); i++) {

				em.persist(usuario.getEstudios().get(i));

			}

			em.persist(usuario.getEstudios());
		}

		if (!(usuario.getExperiencias() == null)) {

			for (int i = 0; i < usuario.getExperiencias().size(); i++) {

				em.persist(usuario.getExperiencias().get(i));

			}

			em.persist(usuario.getExperiencias());
		}

		if (!(usuario.getHabilidades() == null)) {

			for (int i = 0; i < usuario.getHabilidades().size(); i++) {

				em.persist(usuario.getHabilidades().get(i));

			}
			em.persist(usuario.getHabilidades());
		}

		if (!(usuario.getRedesSociales() == null)) {

			for (int i = 0; i < usuario.getRedesSociales().size(); i++) {

				em.persist(usuario.getRedesSociales().get(i));

			}
			em.persist(usuario.getRedesSociales());
		}

		if (!(usuario.getProyectos() == null)) {

			for (int i = 0; i < usuario.getProyectos().size(); i++) {

				em.persist(usuario.getProyectos().get(i));

			}
			em.persist(usuario.getProyectos());
		}

		em.persist(usuario);

	}

}
