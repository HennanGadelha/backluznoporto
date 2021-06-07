package com.luznoporto.pe.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_predio_locador")
public class Predio {

	@Id
	@Column(name = "ploco_id_predio_pk")
    private int id;
	
	@Column(name = "ploco_nm_predio")
    private String nome;
	
	@Column(name = "ploco_end")
	private String endereco;
	
	@Column(name = "ploco_nu")
	private String numero;
	
	@Column(name = "ploco_comple")
	private String complemento;
	
	@Column(name = "ploco_bairro")
	private String bairro;
	
	@Column(name = "ploco_CEP_RUA")
	private String cep;
	
	@Column(name = "ploco_cidade")
	private String cidade;
	
	@Column(name = "ploco_estado")
	private char estado;
	
	@Column(name = "ploco_st_predio")
	private char situacao;
		
    public Predio(){}
    
    public Predio(int id, String nome, String endereco, String numero, String complemento, String bairro, String cep,
			String cidade, char estado, char situacao) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
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
        Predio predio = (Predio) o;
        return id == predio.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

	@Override
    public String toString() {
        return "Predio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }


}
