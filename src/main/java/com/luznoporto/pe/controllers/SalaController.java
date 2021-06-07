package com.luznoporto.pe.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.models.Sala;
import com.luznoporto.pe.repositories.SalaRepository;
import com.luznoporto.pe.services.SalaService;


@RestController
@RequestMapping(value = "/salas")
@CrossOrigin(origins = "http://localhost:3000")
public class SalaController {
	
	
	@Autowired
	SalaRepository salarepository;
	
    @GetMapping
    public ResponseEntity<List<Sala>> findAll(){
    	
    	List<Sala> salas = salarepository.findAll();

        
        return ResponseEntity.ok().body(salas);
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Sala> buscarPorId(@PathVariable int id){
    	
    	Optional<Sala> sala = salarepository.findById(id);
    	return ResponseEntity.ok().body(sala.get());
    	
    }
}
