package com.verbaviva.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.verbaviva.projeto.dto.ProjetoDTORequest;
import com.verbaviva.projeto.entities.Endereco;
import com.verbaviva.projeto.entities.Projeto;
import com.verbaviva.projeto.entities.Usuario;
import com.verbaviva.projeto.repositories.ProjetoRepository;

import jakarta.persistence.EntityNotFoundException;
import com.verbaviva.projeto.services.exceptions.*;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository repository;

	@Autowired
	private EnderecoService enderecoService;

	@Autowired
	private UsuarioService usuarioService;

	public List<Projeto> findAll() {
		return repository.findAll();
	}

	public Projeto findById(Long id) {
		Optional<Projeto> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Projeto insert(ProjetoDTORequest projetoDTO) {
		
		Endereco endereco = enderecoService.findById(projetoDTO.getEnderecoId());
		Usuario usuario = usuarioService.findById(projetoDTO.getUsuarioId());

		Projeto projeto = new Projeto();
		projeto.setNome(projetoDTO.getNome());
		projeto.setDescricao(projetoDTO.getDescricao());
		projeto.setDataCriacao(projetoDTO.getDataCriacao());
		projeto.setEndereco(endereco);
		projeto.setUsuario(usuario);

		return repository.save(projeto);
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

	public Projeto update(Long id, Projeto obj) {
		try {
			Projeto entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(Projeto entity, Projeto obj) {
		entity.setNome(obj.getNome());
		entity.setDescricao(obj.getDescricao());
	}
}