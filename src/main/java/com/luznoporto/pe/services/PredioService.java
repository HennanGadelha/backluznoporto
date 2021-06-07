package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Predio;
import com.luznoporto.pe.repositories.PredioRepository;



@Service
public class PredioService {

	@Autowired
	private PredioRepository predioRepository;
	
	public List<Predio> ListarPredios(){
		return predioRepository.findAll();
	}
}
