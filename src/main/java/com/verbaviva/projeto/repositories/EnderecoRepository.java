package com.verbaviva.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.verbaviva.projeto.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}