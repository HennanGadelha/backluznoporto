package com.luznoporto.pe.models;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_equipamento")
public class Equipamento {

	@Id
	@Column(name = "equ_id_equip_pk")
    private int id;
	
	@Column(name = "equ_nm_equip")
    private String nome;

	
	@JoinColumn(name= "equ_mdd_id_medidor_pk_fk")
	@ManyToOne(cascade = CascadeType.ALL)
	private Medidor medidorEquipamento;
	
	
	@JsonIgnore
	@JoinColumn(name= "equ_spr_id_sala_pk_fk")
	@ManyToOne(cascade = CascadeType.ALL)
	private Sala sala;
	
	
	@JoinColumn(name= "equ_teq_id_tp_equip_pk_fk")
	@ManyToOne(cascade = CascadeType.ALL)
	private TipoDeEquipamento tipoDeEquipamento;

    public  Equipamento(){}

    public Equipamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
   }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


	public void setId(int id) {
		this.id = id;
	}

	
	public Medidor getMedidorEquipamento() {
		return medidorEquipamento;
	}

	public void setMedidorEquipamento(Medidor medidorEquipamento) {
		this.medidorEquipamento = medidorEquipamento;
	}

	
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	
	
	public TipoDeEquipamento getTipoDeEquipamento() {
		return tipoDeEquipamento;
	}

	public void setTipoDeEquipamento(TipoDeEquipamento tipoDeEquipamento) {
		this.tipoDeEquipamento = tipoDeEquipamento;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipamento that = (Equipamento) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }


}
