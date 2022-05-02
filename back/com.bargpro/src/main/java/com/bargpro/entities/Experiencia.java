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
@Table(name = "experiencias")
public class Experiencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String empresa;
	
	private String puesto;
	
	@Temporal(TemporalType.DATE)
	private Calendar fechaInicio;

	@Temporal(TemporalType.DATE)
	private Calendar fechaFinalizacion;
	
	
	
	@Lob
	@Column(length = 300000)
	private String descripcion;



	public Experiencia() {
	}



	public Experiencia(String empresa, String puesto, Calendar fechaInicio, Calendar fechaFinalizacion,
			String descripcion) {
		this.empresa = empresa;
		this.puesto = puesto;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.descripcion = descripcion;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}



	public String getPuesto() {
		return puesto;
	}



	public void setPuesto(String puesto) {
		this.puesto = puesto;
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
	
	
	

}
