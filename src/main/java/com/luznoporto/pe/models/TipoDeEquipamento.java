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
@Table(name = "tb_tipo_equipamento")
public class TipoDeEquipamento {

	@Id
	@Column(name = "teq_id_tp_equip_pk")
    private int id;
	
	@Column(name = "teq_nm_tp_equip")
    private String nome;
	
	@Column(name = "teq_st_tp_equip")
    private char situacao;

	@JsonIgnore
	@OneToMany(mappedBy = "tipoDeEquipamento")
	private List<Equipamento> equipamentos = new ArrayList<>();

    public TipoDeEquipamento(){}

    public TipoDeEquipamento(int id, String nome, char situacao) {
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
        TipoDeEquipamento tipoDeEquipamento = (TipoDeEquipamento) o;
        return id == tipoDeEquipamento.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", situacao=" + situacao +
                '}';
    }


}
