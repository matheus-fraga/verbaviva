package com.verbaviva.projeto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.verbaviva.projeto.entities.Usuario;


public class UsuarioDTOConverter {

    public static UsuarioDTOResponse toDTO(Usuario usuario) {
      UsuarioDTOResponse dto = new UsuarioDTOResponse();
      dto.setId(usuario.getId());
      dto.setNome(usuario.getNome());
      dto.setCpf(usuario.getCpf());
      dto.setDataNascimento(usuario.getDataNascimento());
    
    List<VotoDTOResponse> votoDTOResponses = usuario.getVotos().stream()
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
    dto.setVotos(votoDTOResponses);

List<ProjetoDTOResponse> projetoDTOResponses = usuario.getProjetos().stream()
    .map(projeto -> {
        ProjetoDTOResponse projetoDTO = new ProjetoDTOResponse();
        projetoDTO.setId(projeto.getId());
        projetoDTO.setNome(projeto.getNome());
        projetoDTO.setDescricao(projeto.getDescricao());
        projetoDTO.setDataCriacao(projeto.getDataCriacao());
        projetoDTO.setEndereco(projeto.getEndereco());
        projetoDTO.setStatus(projeto.getStatus());
        projetoDTO.setUsuarioId(projeto.getUsuario().getId());
        projetoDTO.setNomeUsuario(projeto.getUsuario().getNome());

        List<VotoDTOResponse> teste = projeto.getVotos().stream()
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
        projetoDTO.setVotoIds(teste);

        
        return projetoDTO;
    })
    .collect(Collectors.toList());
dto.setProjetos(projetoDTOResponses);

      return dto;
  }

  public static List<UsuarioDTOResponse> toDTOList(List<Usuario> usuarios){
      List<UsuarioDTOResponse> dtos = new ArrayList<>();
      for (Usuario usuario : usuarios) {
          dtos.add(toDTO(usuario));
      }
      return dtos;
  }
}
