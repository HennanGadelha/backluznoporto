package com.luznoporto.pe.repositories;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.OrderBy;

import org.springframework.data.jpa.repository.JpaRepository;


import com.luznoporto.pe.models.Medicao;



public interface MedicaoRepository extends JpaRepository<Medicao, Integer> {

	
	Optional<List<Medicao>> findByInicioMedicaoBetweenOrderByInicioMedicaoAsc(Date inicioMedicao, Date  fimMedicao);
  
}
