package com.luznoporto.pe.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.luznoporto.pe.models.Equipamento;
import com.luznoporto.pe.models.Locatario;
import com.luznoporto.pe.models.Sala;

public class MedicaoDetalhada {

	
	private String nomeFantasia;
	private List<SalaMedicaoDto> nomeSala;
	private List<EquipamentosDto> equipamentos = new ArrayList<>();
	
	
	public MedicaoDetalhada(Locatario locatario, Sala salaEquipamentos) {
		
		this.nomeFantasia = locatario.getNomeFantasia();
		this.nomeSala = locatario.getSalas().stream().map(sala 
				-> new SalaMedicaoDto(sala.getNome())).collect(Collectors.toList());
		
		this.equipamentos = salaEquipamentos.getEquipamentos().stream().map(equipamento 
				-> new EquipamentosDto(equipamento.getNome())).collect(Collectors.toList());
	
		
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public List<SalaMedicaoDto> getNomeSala() {
		return nomeSala;
	}


	public List<EquipamentosDto> getEquipamentos() {
		return equipamentos;
	}
	
	
	
	
	
	
}
