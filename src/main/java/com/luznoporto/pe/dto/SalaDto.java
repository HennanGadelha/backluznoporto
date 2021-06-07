package com.luznoporto.pe.dto;

import com.luznoporto.pe.models.Sala;

public class SalaDto {

	
	private int id;
	private String nome;
	
	public SalaDto(int id, String sala) {
		
		this.id = id;
		this.nome = sala;
	}

	public int getId() {
		return id;
	}

	
	public String getNome() {
		return nome;
	}
	
	
	
	
	
	
	
}
