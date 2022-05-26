package com.bargpro.services;

import com.bargpro.entities.Usuario;

public class Utilidades {

	public static Usuario setearUsuarioEnAtributosDependientes (Usuario usuario){
		
		usuario.getEstudios().forEach((n) -> n.setUsuario(usuario));
		usuario.getExperiencias().forEach((n) -> n.setUsuario(usuario));
		usuario.getHabilidades().forEach((n) -> n.setUsuario(usuario));
		usuario.getProyectos().forEach((n) -> n.setUsuario(usuario));
		
		return usuario;
	}

}
