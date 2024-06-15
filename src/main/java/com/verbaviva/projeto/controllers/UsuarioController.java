package com.verbaviva.projeto.controllers;

import com.verbaviva.projeto.dto.UsuarioDTOConverter;
import com.verbaviva.projeto.dto.UsuarioDTOResponse;
import com.verbaviva.projeto.dto.UsuarioLoginRequest;
import com.verbaviva.projeto.dto.UsuarioLoginResponse;
import com.verbaviva.projeto.entities.Usuario;

import java.net.URI;
import java.util.List;
import com.verbaviva.projeto.services.UsuarioService;

import jakarta.validation.Valid;

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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping(value = "/usuarios")
@Validated
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping
	public ResponseEntity<List<UsuarioDTOResponse>> findAll() {
		List<Usuario> list = service.findAll();
		List<UsuarioDTOResponse> dtos = UsuarioDTOConverter.toDTOList(list);
		return ResponseEntity.ok().body(dtos);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTOResponse> findById(@PathVariable Long id) {
		Usuario obj = service.findById(id);
		UsuarioDTOResponse dto = UsuarioDTOConverter.toDTO(obj);
		return ResponseEntity.ok().body(dto);
	}

	@PostMapping
	public ResponseEntity<UsuarioDTOResponse> insert(@Valid @RequestBody Usuario obj) {
		obj = service.insert(obj);
		UsuarioDTOResponse dto = UsuarioDTOConverter.toDTO(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}


@PostMapping(value="/auth")
public ResponseEntity<UsuarioLoginResponse> authenticate(@Valid @RequestBody UsuarioLoginRequest request){

	Usuario obj = service.findByCpfAndDataNascimento(request.getCpf(), request.getDataNascimento());

    UsuarioLoginResponse response = new UsuarioLoginResponse();

    if (obj != null) {
        response.setAuthenticated(true);
        return ResponseEntity.ok().body(response);
    } else {
        response.setAuthenticated(false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTOResponse> update(@PathVariable Long id, @RequestBody Usuario obj) {
		obj = service.update(id, obj);
		UsuarioDTOResponse dto = UsuarioDTOConverter.toDTO(obj);
		return ResponseEntity.ok().body(dto);
	}
}