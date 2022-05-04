package com.bargpro.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bargpro.entities.DatosUsuario;
import com.bargpro.entities.Estudio;
import com.bargpro.entities.Experiencia;
import com.bargpro.entities.Habilidad;
import com.bargpro.entities.ImagenProyecto;
import com.bargpro.entities.Proyecto;
import com.bargpro.entities.RedSocial;
import com.bargpro.entities.Usuario;

@Repository
@Transactional
public class CreacionDePerfilPropio {
	

	@PersistenceContext
	private EntityManager em;


	// DatosUsuario
	@Transactional
	public void crearDatosUsuario() {

		DatosUsuario datosUsuario = new DatosUsuario();

		datosUsuario.setNombre("Guido");
		datosUsuario.setApellido("Nicolini");
		datosUsuario.setNumeroTelefono("3415780646");
		datosUsuario.setEmail("gnicolini@outlook.com.ar");
		datosUsuario.setPais("Argentina");
		datosUsuario.setProvincia("Santa Fe");
		datosUsuario.setCiudad("Rosario");
		datosUsuario.setLinkImagenPerfil("https://i.imgur.com/xiay3FS.png");
		datosUsuario.setLinkImagenPortada("https://i.imgur.com/LGf56MF.jpg");

		em.persist(datosUsuario);
	}

	// RedSocial
	@Transactional
	public void crearRedSocial() {

		RedSocial redSocial = new RedSocial();

		redSocial.setNombre("GitHub");
		redSocial.setLink("https://github.com/GuidoNicolini");

		em.persist(redSocial);

	}

	// Experiencia
	@Transactional
	public void crearExperiencia() {

		Experiencia experiencia = new Experiencia();

		Calendar fechaInicio = Calendar.getInstance();

		fechaInicio.set(2000, 8, 12);

		Calendar fechaFinal = Calendar.getInstance();

		fechaFinal.set(2010, 5, 21);

		experiencia.setEmpresa("Empresa fabulosa");
		experiencia.setPuesto("Hacedor de cosas");
		experiencia.setFechaInicio(fechaInicio);
		experiencia.setFechaFinalizacion(fechaFinal);
		experiencia.setDescripcion("Aqui trabaje muy duro");

		em.persist(experiencia);

	}

	// Estudio
	@Transactional
	public void crearEstudio() {

		Estudio estudio = new Estudio();

		Calendar fechaInicio = Calendar.getInstance();

		fechaInicio.set(2000, 8, 12);

		Calendar fechaFinal = Calendar.getInstance();

		fechaFinal.set(2010, 5, 21);

		estudio.setTitulo("Doctor en Cosas");
		estudio.setFechaInicio(fechaInicio);
		estudio.setFechaFinalizacion(fechaFinal);
		estudio.setInstitucion("Universidad Fabulosa");
		estudio.setDescripcion("Aqui estudio muy duro");

		em.persist(estudio);

	}

	// Habilidad
	@Transactional
	public void crearHabilidad() {

		Habilidad habilidad = new Habilidad();

		habilidad.setNombre("java");
		habilidad.setNivel(75);

		em.persist(habilidad);
	}

	// Proyecto
	@Transactional
	public void crearProyecto() {

		Proyecto proyecto = new Proyecto();

		Calendar fechaInicio = Calendar.getInstance();

		fechaInicio.set(2000, 8, 12);

		Calendar fechaFinal = Calendar.getInstance();

		fechaFinal.set(2010, 5, 21);

		proyecto.setNombre("Mi Primera App");
		proyecto.setFechaInicio(fechaInicio);
		proyecto.setFechaFinalizacion(fechaFinal);
		proyecto.setDescripcion("Este proyecto se hizo con trabajo duro");
		proyecto.setEnlace("www.google.com");

		em.persist(proyecto);
	}
	@Transactional
	public void crearImagenProyecto() {

		ImagenProyecto imagenProyecto = new ImagenProyecto();

		imagenProyecto.setLinkImagen("https://i.imgur.com/v0voknG.jpg");

		em.persist(imagenProyecto);

	}
	@Transactional
	public void elGranCreador() {

		Usuario usuario = new Usuario();

		List<Experiencia> exp = new ArrayList<>();
		List<Estudio> est = new ArrayList<>();
		List<Habilidad> hab = new ArrayList<>();
		List<Proyecto> pro = new ArrayList<>();
		List<RedSocial> rs = new ArrayList<>();
		List<ImagenProyecto> ip = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			
			crearExperiencia();
			crearEstudio();
			crearHabilidad();
			crearRedSocial();
			crearImagenProyecto();
			crearProyecto();

			Experiencia e1 = em.find(Experiencia.class, i+1);
			
			exp.add(e1);
			
			Estudio e2 = em.find(Estudio.class, i+1);
			
			est.add(e2);
			
			Habilidad e3 = em.find(Habilidad.class, i+1);
			
			hab.add(e3);
			
			RedSocial e4 = em.find(RedSocial.class, i+1);
			
			rs.add(e4);
			
			
			ImagenProyecto e5 = em.find(ImagenProyecto.class, i+1);
			
			ip.add(e5);
			
			Proyecto e6 = em.find(Proyecto.class, i+1);
			
			pro.add(e6);

		}
		
		Proyecto p1 = em.find(Proyecto.class, 1);

		p1.setImagenes(ip);
		
		em.merge(p1);
	
		
		usuario.setDatosUsuario(em.find(DatosUsuario.class, 1));
		usuario.setExperiencias(exp);
		usuario.setEstudios(est);
		usuario.setHabilidades(hab);
		usuario.setProyectos(pro);
		usuario.setRedesSociales(rs);
		
		em.persist(usuario);
	}

}
