package com.dio.ProjetoSantander.repository;

import com.dio.ProjetoSantander.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
