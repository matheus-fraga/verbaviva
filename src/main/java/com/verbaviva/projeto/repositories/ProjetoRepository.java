package com.verbaviva.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verbaviva.projeto.entities.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
  
}
