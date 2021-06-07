package com.luznoporto.pe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luznoporto.pe.models.Usuario;
import com.luznoporto.pe.services.UsuarioService;


@RestController
@RequestMapping(value = "/usuarios")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioDervice;
		
    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
    	List<Usuario> ususarios = usuarioDervice.ListarUsuarios();
        return ResponseEntity.ok().body(ususarios);
    }

}
