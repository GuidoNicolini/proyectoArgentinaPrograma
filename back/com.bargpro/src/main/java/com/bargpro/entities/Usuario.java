package com.bargpro.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	private DatosUsuario datosUsuario;
	
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "usuario" , fetch = FetchType.LAZY)
	private List<Experiencia> experiencias;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario" , fetch = FetchType.LAZY)
	private List<Estudio> estudios;
	
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "usuario" , fetch = FetchType.LAZY)
	private List<Habilidad> habilidades;
	
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "usuario" , fetch = FetchType.LAZY)
	private List<Proyecto> proyectos;
	
	@OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	private List<RedSocial> redesSociales;

	public Usuario() {
	}

	public Usuario(DatosUsuario datosUsuario, List<Experiencia> experiencias, List<Estudio> estudios,
			List<Habilidad> habilidades, List<Proyecto> proyectos, List<RedSocial> redesSociales) {
		this.datosUsuario = datosUsuario;
		this.experiencias = experiencias;
		this.estudios = estudios;
		this.habilidades = habilidades;
		this.proyectos = proyectos;
		this.redesSociales = redesSociales;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DatosUsuario getDatosUsuario() {
		return datosUsuario;
	}

	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}

	public List<Experiencia> getExperiencias() {
		return experiencias;
	}

	public void setExperiencias(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	public List<Estudio> getEstudios() {
		return estudios;
	}

	public void setEstudios(List<Estudio> estudios) {
		this.estudios = estudios;
	}

	public List<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public List<RedSocial> getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(List<RedSocial> redesSociales) {
		this.redesSociales = redesSociales;
	}

}
