package com.verbaviva.projeto.dto;


import java.time.LocalDate;

public class ProjetoDTORequest {
  
    private String nome;
    private String descricao;
    private LocalDate dataCriacao;
    private Long enderecoId;
    private Long usuarioId;

    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getDescricao() {
      return descricao;
    }
    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }
    public LocalDate getDataCriacao() {
      return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
      this.dataCriacao = dataCriacao;
    }
    public Long getEnderecoId() {
      return enderecoId;
    }
    public void setEnderecoId(Long enderecoId) {
      this.enderecoId = enderecoId;
    }
    public Long getUsuarioId() {
      return usuarioId;
    }
    public void setUsuarioId(Long usuarioId) {
      this.usuarioId = usuarioId;
    }

    
}
