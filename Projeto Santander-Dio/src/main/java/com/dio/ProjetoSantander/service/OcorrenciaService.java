package com.dio.ProjetoSantander.service;

import com.dio.ProjetoSantander.model.Ocorrencia;
import com.dio.ProjetoSantander.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository repository;

    public List<Ocorrencia> findAll() {
        return repository.findAll();
    }

    public Optional<Ocorrencia> findById(long id) {
        return repository.findById(id);
    }

    public Ocorrencia save(Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
