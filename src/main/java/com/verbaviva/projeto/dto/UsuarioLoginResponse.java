package com.verbaviva.projeto.dto;


public class UsuarioLoginResponse {

  private Long usuarioId;
  private String nome;
  private boolean isAuthenticated;

  public boolean isAuthenticated() {
    return isAuthenticated;
  }

  public void setAuthenticated(boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }

  public Long getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(Long usuarioId) {
    this.usuarioId = usuarioId;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  

}
