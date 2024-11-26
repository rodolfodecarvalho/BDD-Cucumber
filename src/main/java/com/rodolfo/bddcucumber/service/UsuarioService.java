package com.rodolfo.bddcucumber.service;

import com.rodolfo.bddcucumber.entity.Usuario;
import com.rodolfo.bddcucumber.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}