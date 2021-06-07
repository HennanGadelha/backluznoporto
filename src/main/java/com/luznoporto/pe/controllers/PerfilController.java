package com.luznoporto.pe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.models.Perfil;
import com.luznoporto.pe.services.PerfilService;



@RestController
@RequestMapping(value = "/perfis")
@CrossOrigin(origins = "http://localhost:3000")
public class PerfilController {

	@Autowired
	PerfilService perfilService;
	
	
    @GetMapping
    public ResponseEntity<List<Perfil>> findAll(){
    	
    	List<Perfil> perfis = perfilService.ListarPerfis();

        
        return ResponseEntity.ok().body(perfis);
    }
    
}
