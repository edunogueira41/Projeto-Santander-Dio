package com.dio.ProjetoSantander.repository;

import com.dio.ProjetoSantander.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
