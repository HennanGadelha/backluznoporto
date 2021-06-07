package com.luznoporto.pe.dto;

import java.util.ArrayList;
import java.util.List;

import com.luznoporto.pe.models.Medicao;

public class MedicaoValorTotalDto {

	
	private List<Medicao> medicoes = new ArrayList<>();	
	private String valorTotalDoPeriodo;
	
	public MedicaoValorTotalDto(List<Medicao> medicoesPorPeriodo, String valorTotalDoPeriodo) {
		
		this.medicoes= medicoesPorPeriodo;
		this.valorTotalDoPeriodo = valorTotalDoPeriodo;
	}

	public List<Medicao> getMedicoes() {
		return medicoes;
	}

	public String getValorTotalDoPeriodo() {
		return valorTotalDoPeriodo;
	}

	public void setValorTotalDoPeriodo(String valorTotalDoPeriodo) {
		this.valorTotalDoPeriodo = valorTotalDoPeriodo;
	}


	


	
	
	
	
}
