package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoPenduloConNivelDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoPenduloConNivelBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoPenduloConNivel;
import com.example.YGOCardApp.repository.MonstruoConNivelYDefensaRepository;
import com.example.YGOCardApp.repository.MonstruoPenduloConNivelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class MonstruoPenduloConNivelService<T extends MonstruoConNivelYDefensa> extends MonstruoConNivelYDefensaService<MonstruoPenduloConNivelDTO,MonstruoPenduloConNivel<T>>{
    private final MonstruoPenduloConNivelRepository<T> monstruoPenduloConNivelRepository;

    @Autowired
    public MonstruoPenduloConNivelService(MonstruoConNivelYDefensaRepository<MonstruoPenduloConNivel<T>> monstruoConNivelYDefensaRepository, MonstruoPenduloConNivelRepository<T> monstruoPenduloConNivelRepository) {
        super(monstruoConNivelYDefensaRepository);
        this.monstruoPenduloConNivelRepository=monstruoPenduloConNivelRepository;
    }

    public List<MonstruoPenduloConNivelDTO> getMonstruosByEscala(Integer escala) {
        List<MonstruoPenduloConNivel<T>> monstruosPendulo = monstruoPenduloConNivelRepository.findByEscala(escala);
        return monstruosPendulo.stream().map(this::convertToDTO).collect(Collectors.toList());
    }


    @Override
    protected MonstruoPenduloConNivelDTO convertToDTO(MonstruoPenduloConNivel<T> monstruoPenduloConNivel) {
        MonstruoPenduloConNivelDTO dto = new MonstruoPenduloConNivelDTO();
        dto.setId(monstruoPenduloConNivel.getId());
        dto.setNombre(monstruoPenduloConNivel.getNombre());
        dto.setEfecto(monstruoPenduloConNivel.getEfecto());
        dto.setAtributo(monstruoPenduloConNivel.getAtributo());
        dto.setTipoMonstruo(monstruoPenduloConNivel.getTipoMonstruo());
        dto.setAtaque(monstruoPenduloConNivel.getAtaque());
        dto.setPoseeEfecto(monstruoPenduloConNivel.getPoseeEfecto());
        dto.setNivel(monstruoPenduloConNivel.getNivel());
        dto.setDefensa(monstruoPenduloConNivel.getDefensa());
        dto.setEsCantante(monstruoPenduloConNivel.getEsCantante());
        dto.setEscala(monstruoPenduloConNivel.getEscala());
        dto.setEfectoPendulo(monstruoPenduloConNivel.getEfectoPendulo());
        return dto;
    }

    @Override
    protected MonstruoPenduloConNivel<T> convertToEntity(MonstruoPenduloConNivelDTO dto) {
        return new MonstruoPenduloConNivelBuilder<T>()
                .setId(dto.getId())
                .setNombre(dto.getNombre())
                .setEfecto(dto.getEfecto())
                .setAtributo(dto.getAtributo())
                .setTipoMonstruo(dto.getTipoMonstruo())
                .setAtaque(dto.getAtaque())
                .setPoseeEfecto(dto.getPoseeEfecto())
                .setNivel(dto.getNivel())
                .setDefensa(dto.getDefensa())
                .setCantante(dto.getEsCantante())
                .setEscala(dto.getEscala())
                .setEfectoPendulo(dto.getEfectoPendulo())
                .build();
    }
}
