package com.verbaviva.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.verbaviva.projeto.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

