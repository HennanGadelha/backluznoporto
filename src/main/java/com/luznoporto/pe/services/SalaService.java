package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Sala;
import com.luznoporto.pe.repositories.SalaRepository;

@Service
public class SalaService {

	@Autowired
	private SalaRepository salaRepository;
	
	public List<Sala> ListarSalas(){
		return salaRepository.findAll();
	}
}
