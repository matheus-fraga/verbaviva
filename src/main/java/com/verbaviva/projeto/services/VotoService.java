package com.verbaviva.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.verbaviva.projeto.dto.VotoDTORequest;
import com.verbaviva.projeto.entities.Projeto;
import com.verbaviva.projeto.entities.Usuario;
import com.verbaviva.projeto.entities.Voto;
import com.verbaviva.projeto.repositories.VotoRepository;

import com.verbaviva.projeto.services.exceptions.*;

@Service
public class VotoService {

  @Autowired
  private VotoRepository repository;

  @Autowired
  private UsuarioService usuarioService;

  @Autowired
  private ProjetoService projetoService;

  public List<Voto> findAll() {
    return repository.findAll();
  }

  public Voto findById(Long id) {
    Optional<Voto> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public Voto insert(@RequestBody VotoDTORequest votoDTO) {

    Projeto projeto = projetoService.findById(votoDTO.getProjetoId());
    Usuario usuario = usuarioService.findById(votoDTO.getUsuarioId());

    Voto voto = new Voto();
        voto.setProjeto(projeto);
        voto.setUsuario(usuario);
        voto.setDataCriacao(votoDTO.getDataCriacao());
        
    return repository.save(voto);
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

}
