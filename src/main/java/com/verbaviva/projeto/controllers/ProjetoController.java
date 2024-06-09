package com.verbaviva.projeto.controllers;

import com.verbaviva.projeto.dto.ProjetoDTOConverter;
import com.verbaviva.projeto.dto.ProjetoDTORequest;
import com.verbaviva.projeto.dto.ProjetoDTOResponse;
import com.verbaviva.projeto.dto.UpdateStatusDTO;
import com.verbaviva.projeto.entities.Projeto;
import com.verbaviva.projeto.enums.ProjetoStatus;

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
	public ResponseEntity<List<ProjetoDTOResponse>> findAll() {
		List<Projeto> list = service.findAll();
		List<ProjetoDTOResponse> dtos = ProjetoDTOConverter.toDTOList(list);
		return ResponseEntity.ok().body(dtos);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ProjetoDTOResponse> findById(@PathVariable Long id) {
		Projeto obj = service.findById(id);
		ProjetoDTOResponse dto = ProjetoDTOConverter.toDTO(obj);
		return ResponseEntity.ok().body(dto);
	}

	@PostMapping
	public ResponseEntity<ProjetoDTOResponse> insert(@RequestBody ProjetoDTORequest request) {
		Projeto projeto = service.insert(request);
		ProjetoDTOResponse dto = ProjetoDTOConverter.toDTO(projeto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(projeto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ProjetoDTOResponse> update(@PathVariable Long id, @RequestBody Projeto obj) {
		obj = service.update(id, obj);
		ProjetoDTOResponse dto = ProjetoDTOConverter.toDTO(obj);
		return ResponseEntity.ok().body(dto);
	}

	@PutMapping(value = "/{id}/status")
	public ResponseEntity<?> updateStatus(@PathVariable Long id, @RequestBody UpdateStatusDTO statusDTO) {
		ProjetoStatus status;
		try {
			status = ProjetoStatus.valueOf(statusDTO.getStatus().toUpperCase());
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body("Status inválido");
		}
		Projeto projeto = service.updateStatus(id, status);
		ProjetoDTOResponse dto = ProjetoDTOConverter.toDTO(projeto);
		return ResponseEntity.ok(dto);
	}

}