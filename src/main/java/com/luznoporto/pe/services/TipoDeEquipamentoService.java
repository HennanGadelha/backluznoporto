package com.luznoporto.pe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luznoporto.pe.models.TipoDeEquipamento;
import com.luznoporto.pe.repositories.TipoDeEquipamentoRepository;

@Service
public class TipoDeEquipamentoService {

	@Autowired
	private TipoDeEquipamentoRepository tipoDeEquipamentoRepository;
	
	public List<TipoDeEquipamento> ListarTiposDeEquipamentos(){
		return tipoDeEquipamentoRepository.findAll();
	}
}
