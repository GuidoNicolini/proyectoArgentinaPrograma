package com.bargpro.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bargpro.dao.IUserDAO;
import com.bargpro.entities.Role;

@Service("jpaUserDetailsService")
public class JpaUserDetailsService implements UserDetailsService {

	@Autowired
	private IUserDAO userDAO;

	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.bargpro.entities.User usuario = userDAO.findByUsername(username);

		if (usuario == null) {

			throw new UsernameNotFoundException("Username: " + username + " no existe en el sistema!");
		}

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (Role role : usuario.getRoles()) {

			authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
		}

		if (authorities.isEmpty()) {

			throw new UsernameNotFoundException(
					"Error en el Login: usuario '" + username + "' no tiene roles asignados!");
		}

		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true,
				authorities);
	}

}
