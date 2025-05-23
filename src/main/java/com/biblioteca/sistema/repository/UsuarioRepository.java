package com.biblioteca.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.sistema.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
