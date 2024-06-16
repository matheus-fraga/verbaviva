package com.verbaviva.projeto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.verbaviva.projeto.entities.Projeto;


public class ProjetoDTOConverter {
    
  public static ProjetoDTOResponse toDTO(Projeto projeto) {
      ProjetoDTOResponse dto = new ProjetoDTOResponse();
      dto.setId(projeto.getId());
      dto.setNome(projeto.getNome());
      dto.setDescricao(projeto.getDescricao());
      dto.setDataCriacao(projeto.getDataCriacao());
      dto.setEndereco(projeto.getEndereco());
      dto.setUsuarioId(projeto.getUsuario().getId());
      dto.setNomeUsuario(projeto.getUsuario().getNome());
      dto.setStatus(projeto.getStatus());
   
    List<VotoDTOResponse> votoDTOResponses = projeto.getVotos().stream()
    .map(voto -> {
        VotoDTOResponse votoDTO = new VotoDTOResponse();
        votoDTO.setId(voto.getId());
        votoDTO.setProjetoId(voto.getProjeto().getId());
        votoDTO.setUsuarioId(voto.getUsuario().getId());
        votoDTO.setNomeDoUsuario(voto.getUsuario().getNome());
        votoDTO.setDataCriacao(voto.getDataCriacao());
        return votoDTO;
    })
    .collect(Collectors.toList());
    dto.setVotoIds(votoDTOResponses);

      return dto;
  }

  public static List<ProjetoDTOResponse> toDTOList(List<Projeto> Projetos) {
      List<ProjetoDTOResponse> dtos = new ArrayList<>();
      for (Projeto Projeto : Projetos) {
          dtos.add(toDTO(Projeto));
      }
      return dtos;
  }
}