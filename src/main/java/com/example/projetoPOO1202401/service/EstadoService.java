package com.example.projetoPOO1202401.service;

import com.example.projetoPOO1202401.entity.Estado;
import com.example.projetoPOO1202401.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado>buscarTodos(){
        return estadoRepository.findAll();
    }
}
