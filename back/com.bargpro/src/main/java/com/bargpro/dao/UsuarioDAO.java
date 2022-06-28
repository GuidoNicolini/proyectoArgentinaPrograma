package com.bargpro.dao;

import java.util.List;

import com.bargpro.entities.DatosUsuario;
import com.bargpro.entities.Proyecto;
import com.bargpro.entities.User;
import com.bargpro.entities.Usuario;


public interface UsuarioDAO {

	public List<Usuario> getListaUsuarios();
	public Usuario getUsuario(Integer id);
	public void guardarUsuario(Usuario usuario);
	public void modificarUsuario(Usuario usuario);
	public Proyecto getProyecto(Integer id);
	public void modificarImagenProyectoUsuario(Proyecto proyecto);
	public void guardarUser(User user);

}
 