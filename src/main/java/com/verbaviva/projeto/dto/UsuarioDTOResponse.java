package com.verbaviva.projeto.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDTOResponse {

  private Long id;
  private String nome;
  private String cpf;
  private LocalDate dataNascimento;
  private List<VotoDTOResponse> votos = new ArrayList<>();
  private List<ProjetoDTOResponse> projetos = new ArrayList<>();

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
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  public List<VotoDTOResponse> getVotos() {
    return votos;
  }
  public void setVotos(List<VotoDTOResponse> votos) {
    this.votos = votos;
  }
  public List<ProjetoDTOResponse> getProjetos() {
    return projetos;
  }
  public void setProjetos(List<ProjetoDTOResponse> projetos) {
    this.projetos = projetos;
  }

  

}
