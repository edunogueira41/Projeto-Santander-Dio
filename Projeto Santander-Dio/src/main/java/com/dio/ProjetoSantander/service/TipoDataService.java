package com.dio.ProjetoSantander.service;

import com.dio.ProjetoSantander.model.TipoData;
import com.dio.ProjetoSantander.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    @Autowired
    TipoDataRepository repository;

    public List<TipoData> findAll(){return repository.findAll();}

    public Optional<TipoData> findById(Long id){return repository.findById(id);}

    public TipoData save(TipoData tipoData){return repository.save(tipoData);}

    public void delete(long id){repository.deleteById(id);}
}
