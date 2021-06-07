package com.luznoporto.pe.models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_medicao")
public class Medicao {

	@Id
	@Column(name = "med_id_medicao_pk")
    private int id;
	
	
	@Column(name = "med_dt_ini_medicao")
	private Date inicioMedicao;
	
	
	@Column(name = "med_dt_fin_medicao")
    private Date fimMedicao;
	
	
	@Column(name = "med_vl_medicao")
    private Double valor;
		
	@JsonIgnore
	@JoinColumn(name= "med_mdd_id_medidor_pk_fk")
	@ManyToOne(cascade = CascadeType.ALL)
	private Medidor idMedidor;


	@Deprecated
    public Medicao(){}

    public Medicao(int id, Date inicioMedicao, Date fimMedicao, Double valor) {
        this.id = id;
        this.inicioMedicao = inicioMedicao;
        this.fimMedicao = fimMedicao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public Date getInicioMedicao() {
        return inicioMedicao;
    }

    public void setInicioMedicao(Date inicioMedicao) {
        this.inicioMedicao = inicioMedicao;
    }

    public Date getFimMedicao() {
        return fimMedicao;
    }

    public void setFimMedicao(Date fimMedicao) {
        this.fimMedicao = fimMedicao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

   

	public Medidor getIdMedidor() {
		return idMedidor;
	}

	public void setIdMedidor(Medidor idMedidor) {
		this.idMedidor = idMedidor;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicao medicao = (Medicao) o;
        return id == medicao.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Medicao{" +
                "id=" + id +
                ", inicioMedicao=" + inicioMedicao +
                ", fimMedicao=" + fimMedicao +
                ", valor=" + valor +
                '}'+ "\n";
    }
}
