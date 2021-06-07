package com.luznoporto.pe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.models.Locador;
import com.luznoporto.pe.services.LocadorService;

@RestController
@RequestMapping(value = "/locadores")
@CrossOrigin(origins = "http://localhost:3000")
public class LocadorController {
	
	@Autowired
	LocadorService locadorService;
	
	
    @GetMapping
    public ResponseEntity<List<Locador>> findAll(){
    	
    	List<Locador> locadores = locadorService.ListarLocadores();

        
        return ResponseEntity.ok().body(locadores);
    }
    
    @PostMapping
    public ResponseEntity<Locador> insert(@RequestBody Locador locador){
    	
    	locador = locadorService.cadastrarLocador(locador);
    	
    	return ResponseEntity.ok().body(locador);
    	
    }
	
	
}
