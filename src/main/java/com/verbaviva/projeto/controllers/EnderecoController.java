package com.verbaviva.projeto.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verbaviva.projeto.entities.Endereco;
import com.verbaviva.projeto.repositories.EnderecoRepository;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {
	@Autowired
	private EnderecoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll() {
		List<Endereco> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Endereco>> findById(@PathVariable Long id) {
		Optional<Endereco> obj = repository.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
