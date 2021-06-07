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

import com.luznoporto.pe.models.Medidor;
import com.luznoporto.pe.repositories.MedidorRepository;
import com.luznoporto.pe.services.MedidorService;



@RestController
@RequestMapping(value = "/medidores")
@CrossOrigin(origins = "http://localhost:3000")
public class MedidorController {

	@Autowired
	MedidorRepository medidorRepository;
	
	
    @GetMapping
    public ResponseEntity<List<Medidor>> findAll(){
    	
    	List<Medidor> medidores = medidorRepository.findAll();

        return ResponseEntity.ok().body(medidores);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Medidor> buscarPorId(@PathVariable int id){
    	
    	Optional <Medidor> medidor = medidorRepository.findById(id);
    	
    	return ResponseEntity.ok().body(medidor.get());
    	
    }
    
    
    
}
