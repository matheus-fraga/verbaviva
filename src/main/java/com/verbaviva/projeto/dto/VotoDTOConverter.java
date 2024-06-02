package com.verbaviva.projeto.dto;

import java.util.ArrayList;
import java.util.List;

import com.verbaviva.projeto.entities.Voto;

public class VotoDTOConverter {
    
  public static VotoDTOResponse toDTO(Voto voto) {
      VotoDTOResponse dto = new VotoDTOResponse();
      dto.setId(voto.getId());
      dto.setProjetoId(voto.getProjeto().getId());
      dto.setUsuarioId(voto.getUsuario().getId());
      dto.setNomeDoUsuario(voto.getUsuario().getNome());
      dto.setDataCriacao(voto.getDataCriacao());
      return dto;
  }

  public static List<VotoDTOResponse> toDTOList(List<Voto> votos) {
      List<VotoDTOResponse> dtos = new ArrayList<>();
      for (Voto voto : votos) {
          dtos.add(toDTO(voto));
      }
      return dtos;
  }
}

