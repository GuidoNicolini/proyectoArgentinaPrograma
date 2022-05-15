package com.bargpro.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bargpro.entities.DatosUsuario;
import com.bargpro.entities.Estudio;
import com.bargpro.entities.Experiencia;
import com.bargpro.entities.Habilidad;
import com.bargpro.entities.ImagenProyecto;
import com.bargpro.entities.Proyecto;
import com.bargpro.entities.RedSocial;
import com.bargpro.entities.Usuario;

@Component
@Transactional
public class CreacionDePerfilPropio {
	

	@PersistenceContext
	private EntityManager em;


	@Transactional
public void crearUsuarioLoco(){
	
	
	Usuario usuario = new Usuario();
	
	DatosUsuario du = new DatosUsuario();

	
	du.setNombre("guido");
	du.setApellido("Nicolini");
	
	em.persist(du);
	
	usuario.setDatosUsuario(du);
	
	
	
	em.persist(usuario);
	
}

}
