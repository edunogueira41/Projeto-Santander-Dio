package com.dio.ProjetoSantander.repository;

import java.util.Optional;

import com.dio.ProjetoSantander.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoHorasRepository extends JpaRepository<BancoHoras, BancoHoras.BancoHorasId> {

    Optional<BancoHoras> findByIdIdBancoHoras(Long idBancoHoras);

    void deleteByIdIdBancoHoras(Long idBancoHoras);
}
