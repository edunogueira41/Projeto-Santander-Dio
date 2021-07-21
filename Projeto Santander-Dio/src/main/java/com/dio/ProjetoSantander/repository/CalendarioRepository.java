package com.dio.ProjetoSantander.repository;

import com.dio.ProjetoSantander.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}
