package com.luznoporto.pe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.models.CiaEletrica;

import com.luznoporto.pe.services.CiaEletricaService;


@RestController
@RequestMapping(value = "/cia_eletrica")
@CrossOrigin(origins = "http://localhost:3000")
public class CiaEletricaController {

	
	@Autowired
	CiaEletricaService ciaEletricaService;
	
	
    @GetMapping
    public ResponseEntity<List<CiaEletrica>> findAll(){
    	
    	List<CiaEletrica> ciaEletrica = ciaEletricaService.ListarCiaEletrica();

        
        return ResponseEntity.ok().body(ciaEletrica);
    }
}
