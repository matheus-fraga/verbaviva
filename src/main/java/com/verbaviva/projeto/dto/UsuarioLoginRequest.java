package com.verbaviva.projeto.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;

public class UsuarioLoginRequest {
  
  @CPF(message = "Invalido")
	private String cpf;

	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;

  public String getCpf() {
		return cpf;
	}

	public void setCpf(String email) {
		this.cpf = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}