package com.rodolfo.bddcucumber.repository;

import com.rodolfo.bddcucumber.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}