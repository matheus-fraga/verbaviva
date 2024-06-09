package com.verbaviva.projeto.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.verbaviva.projeto.enums.ProjetoStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "projeto")
public class Projeto implements Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String descricao;

  @Column(name = "data_criacao")
  private LocalDate dataCriacao;

  @Column(name = "status_projeto")
  private ProjetoStatus status;

  @ManyToOne
  @JoinColumn(name = "endereco_id")
  private Endereco endereco;

  @ManyToOne
  @JoinColumn(name = "usuario_id")
  private Usuario usuario;

  @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL, orphanRemoval = true)
  // cascade: ao excluir um projeto, todos os votos associados a esse projeto também serão excluídos.
  private List<Voto> votos = new ArrayList<>();

  public Projeto() {
  }

  public Projeto(Long id, String nome, String descricao, Endereco endereco, LocalDate dataCriacao, Usuario usuario) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.endereco = endereco;
    this.dataCriacao = dataCriacao;
    this.usuario = usuario;
  }

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

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public LocalDate getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(LocalDate dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public ProjetoStatus getStatus() {
    return status;
  }

  public void setStatus(ProjetoStatus status) {
    this.status = status;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public List<Voto> getVotos() {
    return votos;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Projeto other = (Projeto) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
