package com.dio.ProjetoSantander.service;

import com.dio.ProjetoSantander.model.Usuario;
import com.dio.ProjetoSantander.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Optional<Usuario> findById(long id) {
        return repository.findById(id);
    }

    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
