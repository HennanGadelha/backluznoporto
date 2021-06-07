package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.Equipamento;
import com.luznoporto.pe.repositories.EquipamentoRepository;

@Service
public class EquipamentoService {

	@Autowired
	private EquipamentoRepository equipamentoRepository;
	
	public List<Equipamento> ListarEquipamentos(){
		return equipamentoRepository.findAll();
	}
}
