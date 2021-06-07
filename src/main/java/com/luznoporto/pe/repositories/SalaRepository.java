package com.luznoporto.pe.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luznoporto.pe.models.Sala;

public interface SalaRepository extends JpaRepository<Sala, Integer> {

	Sala findByLocatario(String string);

	

	
	
}
