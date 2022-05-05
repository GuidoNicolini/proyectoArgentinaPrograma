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

@Entity
@Table(name = "proyectos")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;

	@Temporal(TemporalType.DATE)
	private Calendar fechaInicio;

	@Temporal(TemporalType.DATE)
	private Calendar fechaFinalizacion;

	@Lob
	@Column(length = 300000)
	private String descripcion;

	private String enlace;

	@OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JoinColumn(name = "proyecto_id")
	private List<ImagenProyecto> imagenes;
	
	
	@ManyToOne
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Proyecto() {
	}

	public Proyecto(String nombre, Calendar fechaInicio, Calendar fechaFinalizacion, String descripcion, String enlace,
			List<ImagenProyecto> imagenes) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.descripcion = descripcion;
		this.enlace = enlace;
		this.imagenes = imagenes;
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

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Calendar getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Calendar fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
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
	
	

}
