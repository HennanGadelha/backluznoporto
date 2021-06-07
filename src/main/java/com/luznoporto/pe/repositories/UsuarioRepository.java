package com.luznoporto.pe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luznoporto.pe.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
