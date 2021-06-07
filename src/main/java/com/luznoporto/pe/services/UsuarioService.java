package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Usuario;
import com.luznoporto.pe.repositories.UsuarioRepository;



@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> ListarUsuarios(){
		return usuarioRepository.findAll();
	}
}
