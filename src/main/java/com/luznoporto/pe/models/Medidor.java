package com.luznoporto.pe.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_medidor")
public class Medidor {

	@Id
	@Column(name = "mdd_id_medidor_pk")
    private int id;
	
	@Column(name = "mdd_ds_medidor")
    private String nome;

    //Por que nao um boolean?
    //fica mais facil validar
	@Column(name="mdd_st_medidor")
    private char situacao;
	
	
	@OneToMany(mappedBy = "idMedidor")
	private List<Medicao> medicoes = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "medidorEquipamento")
	private List<Equipamento> equipamentos = new ArrayList<>();

    public Medidor(){}

    public Medidor(int id, String nome, char situacao) {
        this.id = id;
        this.nome = nome;
        this.situacao = situacao;
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

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }

//
//	public List<Medicao> getMedicoes() {
//		return medicoes;
//	}

	public void setMedicoes(List<Medicao> medicoes) {
		this.medicoes = medicoes;
	}

	
	
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medidor medidor = (Medidor) o;
        return id == medidor.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Medidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", situacao=" + situacao +
                '}';
    }
}
