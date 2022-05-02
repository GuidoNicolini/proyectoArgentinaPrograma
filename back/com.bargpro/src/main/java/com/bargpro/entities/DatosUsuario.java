package com.bargpro.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "datosUsuario")
public class DatosUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String apellido;
	private String numeroTelefono;
	private String email;
	private String pais;
	private String provincia;
	private String ciudad;
	
	@Lob
	@Column(length = 1000)
	private String linkImagenPerfil;
	
	@Lob
	@Column(length = 1000)
	private String linkImagenPortada;

	public DatosUsuario() {
	}

	public DatosUsuario(String nombre, String apellido, String numeroTelefono, String email, String pais,
			String provincia, String ciudad, String linkImagenPerfil, String linkImagenPortada) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroTelefono = numeroTelefono;
		this.email = email;
		this.pais = pais;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.linkImagenPerfil = linkImagenPerfil;
		this.linkImagenPortada = linkImagenPortada;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLinkImagenPerfil() {
		return linkImagenPerfil;
	}

	public void setLinkImagenPerfil(String linkImagenPerfil) {
		this.linkImagenPerfil = linkImagenPerfil;
	}

	public String getLinkImagenPortada() {
		return linkImagenPortada;
	}

	public void setLinkImagenPortada(String linkImagenPortada) {
		this.linkImagenPortada = linkImagenPortada;
	}
	
	
	
}
