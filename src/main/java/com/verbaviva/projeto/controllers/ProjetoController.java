package com.verbaviva.projeto.controllers;


import com.verbaviva.projeto.dto.ProjetoDTORequest;
import com.verbaviva.projeto.entities.Projeto;

import java.net.URI;
import java.util.List;

import com.verbaviva.projeto.services.ProjetoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoController {

	@Autowired
	private ProjetoService service;

	@GetMapping
	public ResponseEntity<List<Projeto>> findAll() {
		List<Projeto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Projeto> findById(@PathVariable Long id) {
		Projeto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<Projeto> insert(@RequestBody ProjetoDTORequest projetoDTO) {
			Projeto projeto = service.insert(projetoDTO);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
							.buildAndExpand(projeto.getId()).toUri();
			return ResponseEntity.created(uri).body(projeto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Projeto> update(@PathVariable Long id, @RequestBody Projeto obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}