package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Locatario;
import com.luznoporto.pe.repositories.LocatarioRepository;

@Service
public class LocatarioService {

	@Autowired
	LocatarioRepository locatarioRepository;
	
	
	public List<Locatario> listarLocatarios(){
		
		return locatarioRepository.findAll();
		
	}
	
}
