package com.verbaviva.projeto.dto;

import java.time.LocalDate;

public class VotoDTOResponse {

    private Long id;
    private Long projetoId;
    private Long usuarioId;
    private String nomeDoUsuario;
    private LocalDate dataCriacao;
    
    public Long getId() {
      return id;
    }
    public void setId(Long id) {
      this.id = id;
    }
    public Long getProjetoId() {
      return projetoId;
    }
    public void setProjetoId(Long projetoId) {
      this.projetoId = projetoId;
    }
    public Long getUsuarioId() {
      return usuarioId;
    }
    public void setUsuarioId(Long usuarioId) {
      this.usuarioId = usuarioId;
    }
    public String getNomeDoUsuario() {
      return nomeDoUsuario;
    }
    public void setNomeDoUsuario(String nomeDoUsuario) {
      this.nomeDoUsuario = nomeDoUsuario;
    }
    public LocalDate getDataCriacao() {
      return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
      this.dataCriacao = dataCriacao;
    }
  
    
    
}