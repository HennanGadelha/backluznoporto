package com.luznoporto.pe.dto;

import java.util.Date;

import com.luznoporto.pe.models.Equipamento;
import com.luznoporto.pe.models.Locatario;
import com.luznoporto.pe.models.Medicao;
import com.luznoporto.pe.models.Medidor;
import com.luznoporto.pe.models.Sala;

public class MedicaoDto {

	private String nomeEquipamento;
	private Date inicioMedicao;
    private Date fimMedicao;
    private Double valor;
    private int idMedidor;
    private int idSala;
    private String nomeSala;
  
    
    public MedicaoDto(Equipamento equipamento, Medidor medidor, Sala sala ) {
    	
    	this.nomeEquipamento = equipamento.getNome();
    	this.inicioMedicao = null;
    	this.fimMedicao = null;
    	this.valor = null;
    	this.idMedidor = medidor.getId();
    	this.idSala = sala.getId();
    	this.nomeSala = sala.getNome();

 
    }


	public Date getInicioMedicao() {
		return inicioMedicao;
	}


	public Date getFimMedicao() {
		return fimMedicao;
	}


	public Double getValor() {
		return valor;
	}





	
	

    
    
	
}
