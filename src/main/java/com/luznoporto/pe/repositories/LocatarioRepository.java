package com.luznoporto.pe.repositories;

import com.luznoporto.pe.models.Locatario;
import com.luznoporto.pe.models.Medicao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocatarioRepository extends JpaRepository<Locatario, String> {

	Locatario findByCnpj(String cnpj);

	Optional<Locatario> findByNomeFantasia(String nomeFantasia);





    
}
