package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Porta;
import com.luznoporto.pe.repositories.PortaRrepository;



@Service
public class PortaService {

	@Autowired
	private PortaRrepository portaRepository;
	
	public List<Porta> ListarPortas(){
		return portaRepository.findAll();
	}
}
