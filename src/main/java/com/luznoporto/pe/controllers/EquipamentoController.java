package com.luznoporto.pe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.models.Equipamento;

import com.luznoporto.pe.services.EquipamentoService;


@RestController
@RequestMapping(value = "/equipamentos")
@CrossOrigin(origins = "http://localhost:3000")

public class EquipamentoController {

	@Autowired
	EquipamentoService equipamentoService;
	
	
    @GetMapping
    public ResponseEntity<List<Equipamento>> findAll(){
    	
    	List<Equipamento> equipamentos = equipamentoService.ListarEquipamentos();

        
        return ResponseEntity.ok().body(equipamentos);
    }
}
