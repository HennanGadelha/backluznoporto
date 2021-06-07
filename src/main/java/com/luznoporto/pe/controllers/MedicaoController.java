package com.luznoporto.pe.controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.dto.MedicaoDto;
import com.luznoporto.pe.dto.MedicaoValorTotalDto;
import com.luznoporto.pe.models.Equipamento;
import com.luznoporto.pe.models.Medicao;
import com.luznoporto.pe.models.Medidor;
import com.luznoporto.pe.repositories.EquipamentoRepository;
import com.luznoporto.pe.repositories.LocatarioRepository;
import com.luznoporto.pe.repositories.MedicaoRepository;
import com.luznoporto.pe.repositories.MedidorRepository;
import com.luznoporto.pe.repositories.SalaRepository;

@RestController
@RequestMapping(value = "/medicoes")
@CrossOrigin(origins = "http://localhost:3000")
public class MedicaoController {

//	@Autowired
//	MedicaoService medicaoService;

	@Autowired
	MedicaoRepository medicaoRepository;

	// EM CONSTRUCAO

	@GetMapping
	public ResponseEntity<List<Medicao>> findAll() {

		List<Medicao> medicoes = medicaoRepository.findAll();

		return ResponseEntity.ok().body(medicoes);
	}

	// TESTAR ESSA REQUISICAO POR ENQUANTO
	//// http://localhost:8080/medicoes/buscarPorPeriodo/2020-05-14/2020-05-15
	@GetMapping("/buscarPorPeriodo/{dataInicio}/{dataFim}")
	public ResponseEntity<MedicaoValorTotalDto> buscarPorData(
			@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataInicio,
			@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataFim) {

		Optional<List<Medicao>> medicoesDatadas = medicaoRepository
				.findByInicioMedicaoBetweenOrderByInicioMedicaoAsc(dataInicio, dataFim);

		List<Double> valoresMedicoes = new ArrayList<>();
		medicoesDatadas.get().forEach(medicoes -> valoresMedicoes.add(medicoes.getValor()));

		Double valorTotalDoPeriodo = 0.0;

		for (int i = 0; i < valoresMedicoes.size(); i++) {

			valorTotalDoPeriodo += valoresMedicoes.get(i);

		}
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("valor total do periodo: " + df.format(valorTotalDoPeriodo));

		return ResponseEntity.ok()
				.body(new MedicaoValorTotalDto(medicoesDatadas.get(), (df.format(valorTotalDoPeriodo) + "kWh")));

	}

}
