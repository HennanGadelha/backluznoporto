package com.luznoporto.pe.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_sala_predio")
public class Sala {

	@Id
	@Column(name = "spr_id_sala_pk")
    private int id;
	
	@Column(name = "spr_nm")
    private String nome;
	
	@Column(name = "spr_ar_m2")
    private Double metragem;
	
	@Column(name = "spr_andar")
    private String andar;
	
	@Column(name = "spr_loca_CNPJ_locatario_pk_fk")
	private String locatario;

	@OneToMany(mappedBy = "sala")
	private List<Equipamento> equipamentos;
	
	@JsonIgnore
	@JoinColumn(name= "spr_loca_CNPJ_locatario_pk_fk", nullable=false, insertable=false, updatable=false)
	@ManyToOne(cascade=CascadeType.ALL)
	private Locatario proprietarioSala;
	
	
    public Sala(){}

    public Sala(int id, String nome, Double metragem, String andar, String locatario) {
        this.id = id;
        this.nome = nome;
        this.metragem = metragem;
        this.andar = andar;
        this.locatario = locatario;
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

    public Double getMetragem() {
        return metragem;
    }

    public void setMetragem(Double metragem) {
        this.metragem = metragem;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }
    
    public String getLocatario() {
		return locatario;
	}
    
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	

	public Locatario getProprietarioSala() {
		return proprietarioSala;
	}

	public void setProprietarioSala(Locatario proprietarioSala) {
		this.proprietarioSala = proprietarioSala;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sala sala = (Sala) o;
        return id == sala.id;
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
                ", metragem=" + metragem +
                ", andar=" + andar +
                '}';
    }


}
