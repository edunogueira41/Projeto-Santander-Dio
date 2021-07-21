package com.dio.ProjetoSantander.repository;

import com.dio.ProjetoSantander.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
