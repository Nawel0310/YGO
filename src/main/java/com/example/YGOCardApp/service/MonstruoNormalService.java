package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoNormalDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoNormalBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoNormal;
import com.example.YGOCardApp.repository.MonstruoConNivelYDefensaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonstruoNormalService extends MonstruoConNivelYDefensaService<MonstruoNormalDTO,MonstruoNormal>{

    @Autowired
    public MonstruoNormalService(MonstruoConNivelYDefensaRepository<MonstruoNormal> monstruoConNivelYDefensaRepository) {
        super(monstruoConNivelYDefensaRepository);
    }

    @Override
    protected MonstruoNormalDTO convertToDTO(MonstruoNormal monstruoNormal) {
        MonstruoNormalDTO dto = new MonstruoNormalDTO();
        dto.setId(monstruoNormal.getId());
        dto.setNombre(monstruoNormal.getNombre());
        dto.setEfecto(monstruoNormal.getEfecto());
        dto.setAtributo(monstruoNormal.getAtributo());
        dto.setTipoMonstruo(monstruoNormal.getTipoMonstruo());
        dto.setAtaque(monstruoNormal.getAtaque());
        dto.setNivel(monstruoNormal.getNivel());
        dto.setDefensa(monstruoNormal.getDefensa());
        dto.setEsCantante(monstruoNormal.getEsCantante());
        return dto;
    }

    @Override
    protected MonstruoNormal convertToEntity(MonstruoNormalDTO dto) {
        return new MonstruoNormalBuilder()
                .setId(dto.getId())
                .setNombre(dto.getNombre())
                .setEfecto(dto.getEfecto())
                .setAtributo(dto.getAtributo())
                .setTipoMonstruo(dto.getTipoMonstruo())
                .setAtaque(dto.getAtaque())
                .setNivel(dto.getNivel())
                .setDefensa(dto.getDefensa())
                .setCantante(dto.getEsCantante())
                .build();
    }
}
