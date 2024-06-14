package com.verbaviva.projeto.controllers;

import com.verbaviva.projeto.dto.VotoDTORequest;
import com.verbaviva.projeto.dto.VotoDTOResponse;
import com.verbaviva.projeto.dto.VotoDTOConverter;
import com.verbaviva.projeto.entities.Voto;

import java.net.URI;
import java.util.List;
import com.verbaviva.projeto.services.VotoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value = "/votos")
public class VotoController {

  @Autowired
  private VotoService service;

    @GetMapping
    public ResponseEntity<List<VotoDTOResponse>> findAll() {
        List<Voto> votos = service.findAll();
        List<VotoDTOResponse> dtos = VotoDTOConverter.toDTOList(votos);
        return ResponseEntity.ok(dtos);
    }

  @GetMapping(value = "/{id}")
  public ResponseEntity<VotoDTOResponse> findById(@PathVariable Long id) {
    Voto obj = service.findById(id);
    VotoDTOResponse dto = VotoDTOConverter.toDTO(obj);
    return ResponseEntity.ok().body(dto);
  }


@PostMapping
public ResponseEntity<?> insert(@RequestBody VotoDTORequest request) {
    try {
        Voto voto = service.insert(request);
        VotoDTOResponse dto = VotoDTOConverter.toDTO(voto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(voto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    } catch (DataIntegrityViolationException e) {
        return ResponseEntity.badRequest().body("Este usuário já votou neste projeto.");
    }
}

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}