package com.verbaviva.projeto.repositories;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.verbaviva.projeto.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
  Optional<Usuario> findByCpfAndDataNascimento(String cpf, LocalDate dataNascimento);
}

