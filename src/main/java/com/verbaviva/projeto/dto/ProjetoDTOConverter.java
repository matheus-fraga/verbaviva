package com.verbaviva.projeto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.verbaviva.projeto.entities.Projeto;
import com.verbaviva.projeto.entities.Voto;

public class ProjetoDTOConverter {
    
  public static ProjetoDTOResponse toDTO(Projeto projeto) {
      ProjetoDTOResponse dto = new ProjetoDTOResponse();

      dto.setNome(projeto.getNome());
      dto.setDescricao(projeto.getDescricao());
      dto.setDataCriacao(projeto.getDataCriacao());
      dto.setEndereco(projeto.getEndereco());
      dto.setUsuarioId(projeto.getUsuario().getId());
      dto.setNomeUsuario(projeto.getUsuario().getNome());
      dto.setStatus(projeto.getStatus());
       List<Long> votoIds = projeto.getVotos().stream()
                                .map(Voto::getId)
                                .collect(Collectors.toList());
    dto.setVotoIds(votoIds);
   
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