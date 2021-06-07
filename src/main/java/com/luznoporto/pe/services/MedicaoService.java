package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Medicao;
import com.luznoporto.pe.repositories.MedicaoRepository;


@Service
public class MedicaoService {

	@Autowired
	private MedicaoRepository medicaoRepository;
	
	public List<Medicao> ListarMedicoes(){
		return medicaoRepository.findAll();
	}
}
