package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoFusionDTO;
import com.example.YGOCardApp.DTO.MonstruoRitualDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoRitualBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoRitual;
import com.example.YGOCardApp.repository.MonstruoConNivelYDefensaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonstruoRitualService extends MonstruoConNivelYDefensaService<MonstruoRitualDTO, MonstruoRitual>  {

    @Autowired
    public MonstruoRitualService(MonstruoConNivelYDefensaRepository<MonstruoRitual> monstruoConNivelYDefensaRepository) {
        super(monstruoConNivelYDefensaRepository);
    }

    @Override
    protected MonstruoRitualDTO convertToDTO(MonstruoRitual monstruoRitual) {
        MonstruoRitualDTO dto = new MonstruoRitualDTO();
        dto.setId(monstruoRitual.getId());
        dto.setNombre(monstruoRitual.getNombre());
        dto.setEfecto(monstruoRitual.getEfecto());
        dto.setAtributo(monstruoRitual.getAtributo());
        dto.setTipoMonstruo(monstruoRitual.getTipoMonstruo());
        dto.setAtaque(monstruoRitual.getAtaque());
        dto.setPoseeEfecto(monstruoRitual.getPoseeEfecto());
        dto.setNivel(monstruoRitual.getNivel());
        dto.setDefensa(monstruoRitual.getDefensa());
        dto.setEsCantante(monstruoRitual.getEsCantante());
        return dto;
    }

    @Override
    protected MonstruoRitual convertToEntity(MonstruoRitualDTO dto) {
        return new MonstruoRitualBuilder()
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
