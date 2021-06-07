package com.luznoporto.pe.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.luznoporto.pe.models.Locatario;
import com.luznoporto.pe.models.Sala;

public class LocatarioDto {

	
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String nomeResponsavel;
    private SalaDto sala;
	
    public LocatarioDto(Locatario locatario, SalaDto salaDto) {
		
		this.cnpj = locatario.getCnpj();
		this.nomeFantasia = locatario.getNomeFantasia();
		this.razaoSocial = locatario.getRazaoSocial();
		this.nomeResponsavel = locatario.getNomeResponsavel();
		this.sala = salaDto;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public SalaDto getSala() {
		return sala;
	}
	
    

	/*public static List<LocatarioDto> converter(List<Locatario> locatarios){
    	
    	return locatarios.stream().map(LocatarioDto::new).collect(Collectors.toList());
    }*/
    
	
	
	
}
