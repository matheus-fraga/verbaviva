package com.verbaviva.projeto.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "voto")
public class Voto implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "projeto_id")
  private Projeto projeto;

  @ManyToOne
  @JoinColumn(name = "usuario_id")
  private Usuario usuario;

  @Column(name = "data_criacao")
  private LocalDate dataCriacao;

  public Voto() {
  }

  public Voto(Long id, Projeto projeto, Usuario usuario, LocalDate dataCriacao) {
    this.id = id;
    this.projeto = projeto;
    this.usuario = usuario;
    this.dataCriacao = dataCriacao;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Projeto getProjeto() {
    return projeto;
  }

  public void setProjeto(Projeto projeto) {
    this.projeto = projeto;
  }

  public LocalDate getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(LocalDate dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
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
    Voto other = (Voto) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  
}
