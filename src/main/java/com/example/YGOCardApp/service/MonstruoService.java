package com.example.YGOCardApp.service;


import com.example.YGOCardApp.entities.Monstruo.*;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.repository.MonstruoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public abstract class MonstruoService<T, S extends Monstruo> extends CartaService<T, S> {

    private final MonstruoRepository<S> monstruoRepository;

    @Autowired
    public MonstruoService(MonstruoRepository<S> monstruoRepository) {
        super(monstruoRepository);
        this.monstruoRepository = monstruoRepository;
    }

    public List<T> getMonstruosByAtributo(Atributo atributo) {
        List<S> monstruos = ((MonstruoRepository<S>) monstruoRepository).findByAtributo(atributo);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<T> getMonstruosByTipoMonstruo(TipoMonstruo tipoMonstruo) {
        List<S> monstruos = ((MonstruoRepository<S>) monstruoRepository).findByTipoMonstruo(tipoMonstruo);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<T> getMonstruosByAtaque(Integer ataque) {
        List<S> monstruos = ((MonstruoRepository<S>) monstruoRepository).findByAtaque(ataque);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<T> getMonstruosByPoseeEfecto(Boolean poseeEfecto) {
        List<S> monstruos = ((MonstruoRepository<S>) monstruoRepository).findByPoseeEfecto(poseeEfecto);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}

