package com.verbaviva.projeto.entities;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rua;
	private String cep;
	private String bairro;
	private String municipio;
	private String estado;
	private String coordenadaX;
	private String coordenadaY;
	
	public Endereco() {}

	public Endereco(Long id, String rua, String cep, String bairro, String municipio, String estado, String coordenadaX,
			String coordenadaY) {
		super();
		this.id = id;
		this.rua = rua;
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the coordenadaX
	 */
	public String getCoordenadaX() {
		return coordenadaX;
	}

	/**
	 * @param coordenadaX the coordenadaX to set
	 */
	public void setCoordenadaX(String coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	/**
	 * @return the coordenadaY
	 */
	public String getCoordenadaY() {
		return coordenadaY;
	}

	/**
	 * @param coordenadaY the coordenadaY to set
	 */
	public void setCoordenadaY(String coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id);
	}
	
}
