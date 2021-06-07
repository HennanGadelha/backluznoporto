package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Perfil;
import com.luznoporto.pe.repositories.PerfilRepository;



@Service
public class PerfilService {

	@Autowired
	private PerfilRepository perfilRepository;
	
	public List<Perfil> ListarPerfis(){
		return perfilRepository.findAll();
	}
}
