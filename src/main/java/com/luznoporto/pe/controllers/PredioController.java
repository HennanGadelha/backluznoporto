package com.luznoporto.pe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.models.Predio;
import com.luznoporto.pe.services.PredioService;



@RestController
@RequestMapping(value = "/predios")
@CrossOrigin(origins = "http://localhost:3000")
public class PredioController {

	@Autowired
	PredioService predioService;
	
	
    @GetMapping
    public ResponseEntity<List<Predio>> findAll(){
    	
    	List<Predio> predios = predioService.ListarPredios();

        
        return ResponseEntity.ok().body(predios);
    }
}
