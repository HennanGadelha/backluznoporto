package com.luznoporto.pe.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_locador")
public class Locador {

	@Id
	@Column(name="loco_CNPJ_locador_pk")
    private String cnpj;
	
	@Column(name="loco_nm_fantasia")
    private String nomeFantasia;
	
	@Column(name="loco_razao_social")
    private String razaoSocial;

    //Deverá virar uma entidade.
	@Column(name="loco_nm_resp_tecnico")
    private String nomeResponsavel;


    public Locador(){}

    public Locador(String cnpj, String nomeFantasia, String razaoSocial, String nomeResponsavel) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locador locador = (Locador) o;
        return Objects.equals(cnpj, locador.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }

    @Override
    public String toString() {
        return "Locador{" +
                "cnpj='" + cnpj + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeResponsavel='" + nomeResponsavel + '\'' +
                '}';
    }



}
