package com.bargpro.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "proyectos")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;

	
	private String fechaInicio;

	
	private String fechaFinalizacion;

	@Lob
	@Column(length = 300000)
	private String descripcion;

	private String enlace;

	@OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "proyecto_id")
	private List<ImagenProyecto> imagenes;
	
	
	@ManyToOne
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}
	
	



	public Proyecto(Integer id, String nombre, String fechaInicio, String fechaFinalizacion, String descripcion,
			String enlace, List<ImagenProyecto> imagenes, Usuario usuario) {
		this.id = id;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.descripcion = descripcion;
		this.enlace = enlace;
		this.imagenes = imagenes;
		this.usuario = usuario;
	}





	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Proyecto() {
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public List<ImagenProyecto> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<ImagenProyecto> imagenes) {
		this.imagenes = imagenes;
	}





	public String getFechaInicio() {
		return fechaInicio;
	}





	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}





	public String getFechaFinalizacion() {
		return fechaFinalizacion;
	}





	public void setFechaFinalizacion(String fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}
	
	

}
