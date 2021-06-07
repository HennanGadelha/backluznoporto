package com.luznoporto.pe.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_porta_medidor")
public class Porta {

	@Id
	@Column(name = "pmd_id_porta_medidor_pk")
    private int id;

	@Column(name = "pmd_ds_porta_medidor")
	private String descricao;
	
	@Column(name = "pmd_st_porta_medidor")
	private char situacao;
		
    public Porta(){}

    public Porta(int id, String descricao, char situacao) {
		this.id = id;
		this.descricao = descricao;
		this.situacao = situacao;
	}
   
	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public char getSituacao() {
		return situacao;
	}

	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porta porta = (Porta) o;
        return id == porta.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Porta{" +
                "id=" + id +
                "descricao=" + descricao +
                "situacao=" + situacao +
                '}';
    }
}
