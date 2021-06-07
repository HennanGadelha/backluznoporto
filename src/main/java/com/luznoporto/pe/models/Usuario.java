package com.luznoporto.pe.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@Column(name = "usu_CPF_usuario_pk")
    private int cpf;
	
	@Column(name = "usu_nm_usuario")
    private String nome;
	
    @Column(name = "usu_email_usuario")
    private String email;

    @Column(name = "usu_st_usuario")
    private char situacao;

    public Usuario(){}

    public Usuario(int cpf, String nome, String email, char situacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.situacao = situacao;
    }

   
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        Usuario usuario = (Usuario) o;
        return cpf == usuario.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", situacao=" + situacao +
                '}';
    }
}
