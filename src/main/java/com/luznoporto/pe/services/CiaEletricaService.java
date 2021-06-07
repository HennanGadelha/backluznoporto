package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.CiaEletrica;
import com.luznoporto.pe.repositories.CiaEletricaRepository;



@Service
public class CiaEletricaService {

	@Autowired
	private CiaEletricaRepository ciaEletricaRepository;
	
	public List<CiaEletrica> ListarCiaEletrica(){
		return ciaEletricaRepository.findAll();
	}
}
