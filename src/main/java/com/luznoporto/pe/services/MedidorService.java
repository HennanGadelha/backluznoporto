package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Medidor;
import com.luznoporto.pe.repositories.MedidorRepository;



@Service
public class MedidorService {

	@Autowired
	private MedidorRepository medidorRepository;
	
	public List<Medidor> ListarMedidores(){
		return medidorRepository.findAll();
	}
	

	
}
