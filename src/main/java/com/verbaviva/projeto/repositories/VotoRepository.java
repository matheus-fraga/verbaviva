package com.verbaviva.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verbaviva.projeto.entities.Voto;

public interface VotoRepository extends JpaRepository<Voto, Long> {
  
}
