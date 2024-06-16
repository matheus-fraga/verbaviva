package com.verbaviva.projeto.dto;

import java.time.LocalDate;
import java.util.List;

import com.verbaviva.projeto.entities.Endereco;
import com.verbaviva.projeto.enums.ProjetoStatus;

public class ProjetoDTOResponse {
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataCriacao;
    private Endereco endereco;
    private ProjetoStatus status;
    private Long usuarioId;
    private String nomeUsuario;
    private List<VotoDTOResponse> votoIds;

    public Long getId() {
      return id;
    }
    public void setId(Long id) {
      this.id = id;
    }
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
    public Endereco getEndereco() {
      return endereco;
    }
    public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
    }
    public Long getUsuarioId() {
      return usuarioId;
    }
    public void setUsuarioId(Long usuarioId) {
      this.usuarioId = usuarioId;
    }
    public String getNomeUsuario() {
      return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
      this.nomeUsuario = nomeUsuario;
    }
    public List<VotoDTOResponse> getVotoIds() {
      return votoIds;
    }
    public void setVotoIds(List<VotoDTOResponse> votoIds) {
      this.votoIds = votoIds;
    }
    
    public ProjetoStatus getStatus() {
        return status;
    }
    public void setStatus(ProjetoStatus status) {
        this.status = status;
    }
}