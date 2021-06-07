package com.luznoporto.pe.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_locatario")
public class Locatario {

    @Id
    @Column(name="loca_CNPJ_locatario_pk")
    private String cnpj;
    
    @Column(name="loca_nm_fantasia")
    private String nomeFantasia;
    
    @Column(name="loca_razao_social")
    private String razaoSocial;
    
    @Column(name="loca_resp_tecnico")
    private String nomeResponsavel;
    
    @OneToMany(mappedBy = "proprietarioSala")
    private List<Sala> salas = new ArrayList<>();

    public Locatario() {}

    public Locatario(String cnpj, String nomeFantasia, String razaoSocial, String nomeResponsavel) {
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

    public List<Sala> getSalas() {
		return salas;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locatario locatario = (Locatario) o;
        return Objects.equals(cnpj, locatario.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }

    @Override
    public String toString() {
        return "Locatario{" +
                "cnpj='" + cnpj + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeResponsavel='" + nomeResponsavel + '\'' +
                '}';
    }

}
