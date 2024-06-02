package com.verbaviva.projeto.dto;

import java.time.LocalDate;

public class VotoDTORequest {
  private Long projetoId;
  private Long usuarioId;
  private LocalDate dataCriacao;
  
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
  public LocalDate getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(LocalDate dataCriacao) {
    this.dataCriacao = dataCriacao;
  }
  
}
