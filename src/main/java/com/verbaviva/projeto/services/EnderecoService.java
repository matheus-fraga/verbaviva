package com.verbaviva.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.verbaviva.projeto.entities.Endereco;
import com.verbaviva.projeto.repositories.EnderecoRepository;

import jakarta.persistence.EntityNotFoundException;
import com.verbaviva.projeto.services.exceptions.*;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;

	public List<Endereco> findAll() {
		return repository.findAll();
	}

	public Endereco findById(Long id) {
		Optional<Endereco> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Endereco insert(Endereco obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Endereco update(Long id, Endereco obj) {
		try {
			Endereco entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}	
	}

	private void updateData(Endereco entity, Endereco obj) {
		entity.setRua(obj.getRua());
		entity.setCep(obj.getCep());
		entity.setBairro(obj.getBairro());
    entity.setMunicipio(obj.getMunicipio());
    entity.setEstado(obj.getEstado());
    entity.setCoordenadaX(obj.getCoordenadaX());
    entity.setCoordenadaY(obj.getCoordenadaY());
	}
}