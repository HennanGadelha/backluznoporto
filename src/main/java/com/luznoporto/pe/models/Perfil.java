package com.luznoporto.pe.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_perfil_usuario")
public class Perfil {

	@Id
	@Column(name = "pusu_id_perfil_pk")
    private int id;
	
	@Column(name = "pusu_ds_perfil")
    private String descricao;
	
	@Column(name = "pusu_admim")
    private int admin;
	
	@Column(name = "pusu_cadastro_total")
    private int cadastroTotal;
	
	@Column(name = "pusu_dashboard_total")
    private int dashboardTotal;
	
	@Column(name = "pusu_dados_energeticos_total")
    private int dadosEnergeticosTotal;
	
	@Column(name = "pusu_consumo_energetico_total")
    private int consumoEnergeticoTotal;
	
	@Column(name = "pusu_relatório_total")
    private int relatórioTotal;
	
	@Column(name = "pusu_st_perfil")
    private char situacao;
	
	public Perfil() {}
	
    public Perfil(int id, String descricao, int admin, int cadastroTotal, int dashboardTotal, int dadosEnergeticosTotal,
			int consumoEnergeticoTotal, int relatórioTotal, char situacao) {
		this.id = id;
		this.descricao = descricao;
		this.admin = admin;
		this.cadastroTotal = cadastroTotal;
		this.dashboardTotal = dashboardTotal;
		this.dadosEnergeticosTotal = dadosEnergeticosTotal;
		this.consumoEnergeticoTotal = consumoEnergeticoTotal;
		this.relatórioTotal = relatórioTotal;
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

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public int getCadastroTotal() {
		return cadastroTotal;
	}

	public void setCadastroTotal(int cadastroTotal) {
		this.cadastroTotal = cadastroTotal;
	}

	public int getDashboardTotal() {
		return dashboardTotal;
	}

	public void setDashboardTotal(int dashboardTotal) {
		this.dashboardTotal = dashboardTotal;
	}

	public int getDadosEnergeticosTotal() {
		return dadosEnergeticosTotal;
	}

	public void setDadosEnergeticosTotal(int dadosEnergeticosTotal) {
		this.dadosEnergeticosTotal = dadosEnergeticosTotal;
	}

	public int getConsumoEnergeticoTotal() {
		return consumoEnergeticoTotal;
	}

	public void setConsumoEnergeticoTotal(int consumoEnergeticoTotal) {
		this.consumoEnergeticoTotal = consumoEnergeticoTotal;
	}

	public int getRelatórioTotal() {
		return relatórioTotal;
	}

	public void setRelatórioTotal(int relatórioTotal) {
		this.relatórioTotal = relatórioTotal;
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
        Perfil perfil = (Perfil) o;
        return id == perfil.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", admin='" + admin + '\'' +
                ", cadastroTotal='" + cadastroTotal + '\'' +
                ", dashboardTotal='" + dashboardTotal + '\'' +
                ", dadosEnergeticosTotal='" + dadosEnergeticosTotal + '\'' +
                ", consumoEnergeticoTotal='" + consumoEnergeticoTotal + '\'' +
                ", relatórioTotal='" + relatórioTotal + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
