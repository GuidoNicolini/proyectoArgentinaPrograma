package com.bargpro.dao;

import java.util.List;

import com.bargpro.entities.Usuario;


public interface UsuarioDAO {

	public List<Usuario> getListaUsuarios();
	public Usuario getUsuario(Integer id);
	public void guardarUsuario(Usuario usuario);

}
 