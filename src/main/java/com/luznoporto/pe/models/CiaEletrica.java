package com.luznoporto.pe.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cia_eletrica")
public class CiaEletrica {

	@Column(name = "cel_nm_fantasia")
	private String nome;
    
	@Column(name = "cel_nm_razao_social")
    private String razaoSocial;
	
	@Column(name = "cel_resp_tecnico")
	private String responsavelTecnico;
	
	@Column(name = "cel_end")
	private String endereco;
	
	@Column(name = "cel_nu")
	private String numero;
	
	@Column(name = "cel_comple")
	private String complemento;
	
	@Column(name = "cel_bairro")
	private String bairro;
	
	@Column(name = "cel_CEP_RUA")
	private String cep;
	
	@Column(name = "cel_cidade")
	private String cidade;
	
	@Column(name = "cel_estado")
	private String estado;
	
	@Id
	@Column(name = "cel_CNPJ_cia_eletrica_pk")
	private String cnpj;
	
	public CiaEletrica() {}
	
    public CiaEletrica(String nome, String razaoSocial, String responsavelTecnico, String endereco, String numero,
			String complemento, String bairro, String cep, String cidade, String estado, String cnpj) {
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.responsavelTecnico = responsavelTecnico;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getResponsavelTecnico() {
		return responsavelTecnico;
	}

	public void setResponsavelTecnico(String responsavelTecnico) {
		this.responsavelTecnico = responsavelTecnico;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CiaEletrica that = (CiaEletrica) o;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }

    @Override
    public String toString() {
        return "CiaEletrica{" +
                ", nome='" + nome + '\'' +
                ", responsavelTecnico='" + responsavelTecnico + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", bairro='" + bairro + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
