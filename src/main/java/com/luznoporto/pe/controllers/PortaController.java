package com.luznoporto.pe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.models.Porta;
import com.luznoporto.pe.services.PortaService;



@RestController
@RequestMapping(value = "/portas")
@CrossOrigin(origins = "http://localhost:3000")
public class PortaController {

	@Autowired
	PortaService portaService;
	
	
    @GetMapping
    public ResponseEntity<List<Porta>> findAll(){
    	
    	List<Porta> porta = portaService.ListarPortas();

        
        return ResponseEntity.ok().body(porta);
    }
}
