package com.bargpro.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "estudios")
public class Estudio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String titulo;

	@Temporal(TemporalType.DATE)
	private Calendar fechaInicio;

	@Temporal(TemporalType.DATE)
	private Calendar fechaFinalizacion;

	private String Institucion;

	@Lob
	@Column(length = 300000)
	private String descripcion;

	public Estudio() {
	}

	public Estudio(String titulo, Calendar fechaInicio, Calendar fechaFinalizacion, String institucion,
			String descripcion) {
		this.titulo = titulo;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		Institucion = institucion;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public String getInstitucion() {
		return Institucion;
	}

	public void setInstitucion(String institucion) {
		Institucion = institucion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
