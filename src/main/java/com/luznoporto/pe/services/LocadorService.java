package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Locador;
import com.luznoporto.pe.repositories.LocadorRepository;

@Service
public class LocadorService {

	
	@Autowired
	private LocadorRepository locadorRepository;
	
	public List<Locador> ListarLocadores(){
		return locadorRepository.findAll();
	}
	
	
	public Locador cadastrarLocador(Locador locador) {
		
		locadorRepository.save(locador);
		return locador;
		
	}
	
	
}
