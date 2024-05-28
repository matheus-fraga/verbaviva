package com.verbaviva.projeto.entities;

import java.io.Serializable;
import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;

import jakarta.persistence.Column;

// import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;

	// @JsonIgnore
	// @OneToMany(mappedBy = "usuario")
	// private List<Votos> votos = new ArrayList<>();

	// @JsonIgnore
	// @OneToMany(mappedBy = "usuario")
	// private List<Projetos> projetos = new ArrayList<>();

	public Usuario() {
	}

	public Usuario(Long id, String nome, String cpf, LocalDate dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;

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

	// public List<Votos> getVotos() {
	// return votos;
	// }

	// public List<Projetos> getProjetos() {
	// return projetos;
	// }

	// @Override
	// public int hashCode() {
	// 	final int prime = 31;
	// 	int result = 1;
	// 	result = prime * result + ((id == null) ? 0 : id.hashCode());
	// 	return result;
	// }

	// @Override
	// public boolean equals(Object obj) {
	// 	if (this == obj)
	// 		return true;
	// 	if (obj == null)
	// 		return false;
	// 	if (getClass() != obj.getClass())
	// 		return false;
	// 	Usuario other = (Usuario) obj;
	// 	if (id == null) {
	// 		if (other.id != null)
	// 			return false;
	// 	} else if (!id.equals(other.id))
	// 		return false;
	// 	return true;
	// }
}