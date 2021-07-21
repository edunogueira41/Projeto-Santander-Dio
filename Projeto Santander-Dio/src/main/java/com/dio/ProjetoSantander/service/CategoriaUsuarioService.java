package com.dio.ProjetoSantander.service;

import com.dio.ProjetoSantander.model.CategoriaUsuario;
import com.dio.ProjetoSantander.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    @Autowired
    CategoriaUsuarioRepository repository;

    public List<CategoriaUsuario> findAll() {
        return repository.findAll();
    }

    public Optional<CategoriaUsuario> findById(long id) {
        return repository.findById(id);
    }

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario) {
        return repository.save(categoriaUsuario);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
