package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoFusionDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoFusionBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoFusion;
import com.example.YGOCardApp.repository.MonstruoConNivelYDefensaRepository;

public class MonstruoFusionService extends MonstruoConNivelYDefensaService<MonstruoFusionDTO, MonstruoFusion>{

    public MonstruoFusionService(MonstruoConNivelYDefensaRepository<MonstruoFusion> monstruoConNivelYDefensaRepository) {
        super(monstruoConNivelYDefensaRepository);
    }

    @Override
    protected MonstruoFusionDTO convertToDTO(MonstruoFusion monstruoFusion) {
        MonstruoFusionDTO dto = new MonstruoFusionDTO();
        dto.setId(monstruoFusion.getId());
        dto.setNombre(monstruoFusion.getNombre());
        dto.setEfecto(monstruoFusion.getEfecto());
        dto.setAtributo(monstruoFusion.getAtributo());
        dto.setTipoMonstruo(monstruoFusion.getTipoMonstruo());
        dto.setAtaque(monstruoFusion.getAtaque());
        dto.setPoseeEfecto(monstruoFusion.getPoseeEfecto());
        dto.setNivel(monstruoFusion.getNivel());
        dto.setDefensa(monstruoFusion.getDefensa());
        dto.setEsCantante(monstruoFusion.getEsCantante());
        return dto;
    }

    @Override
    protected MonstruoFusion convertToEntity(MonstruoFusionDTO dto) {
        return new MonstruoFusionBuilder()
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
                .build();
    }
}
