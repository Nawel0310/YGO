package com.example.YGOCardApp.service;


import com.example.YGOCardApp.DTO.MonstruoDTO;
import com.example.YGOCardApp.entities.Monstruo.*;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.repository.MonstruoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public abstract class MonstruoService extends CartaService<MonstruoDTO,Monstruo> {

    private final MonstruoRepository monstruoRepository;

    @Autowired
    public MonstruoService(MonstruoRepository monstruoRepository) {
        super(monstruoRepository);
        this.monstruoRepository = monstruoRepository;
    }

    public List<MonstruoDTO> getMonstruosByAtributo(Atributo atributo) {
        List<Monstruo> monstruos = monstruoRepository.findByAtributo(atributo);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<MonstruoDTO> getMonstruosByTipoMonstruo(TipoMonstruo tipoMonstruo) {
        List<Monstruo> monstruos = monstruoRepository.findByTipoMonstruo(tipoMonstruo);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<MonstruoDTO> getMonstruosByAtaque(Integer ataque) {
        List<Monstruo> monstruos = monstruoRepository.findByAtaque(ataque);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    /*Posteriormente podrían implementarse métodos
     para buscar AtaqueMayorA o AtaqueMenorA*/

    public List<MonstruoDTO> getMonstruosByPoseeEfecto(Boolean poseeEfecto) {
        List<Monstruo> monstruos = monstruoRepository.findByPoseeEfecto(poseeEfecto);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

}
