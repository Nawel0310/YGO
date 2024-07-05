package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoFusionDTO;
import com.example.YGOCardApp.DTO.MonstruoSincroniaDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoSincroniaBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoSincronia;
import com.example.YGOCardApp.repository.MonstruoConNivelYDefensaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonstruoSincroniaService extends MonstruoConNivelYDefensaService<MonstruoSincroniaDTO, MonstruoSincronia>{

    @Autowired
    public MonstruoSincroniaService(MonstruoConNivelYDefensaRepository<MonstruoSincronia> monstruoConNivelYDefensaRepository) {
        super(monstruoConNivelYDefensaRepository);
    }

    @Override
    protected MonstruoSincroniaDTO convertToDTO(MonstruoSincronia monstruoSincronia) {

        MonstruoSincroniaDTO dto = new MonstruoSincroniaDTO();

        dto.setId(monstruoSincronia.getId());
        dto.setNombre(monstruoSincronia.getNombre());
        dto.setEfecto(monstruoSincronia.getEfecto());
        dto.setAtributo(monstruoSincronia.getAtributo());
        dto.setTipoMonstruo(monstruoSincronia.getTipoMonstruo());
        dto.setAtaque(monstruoSincronia.getAtaque());
        dto.setPoseeEfecto(monstruoSincronia.getPoseeEfecto());
        dto.setNivel(monstruoSincronia.getNivel());
        dto.setDefensa(monstruoSincronia.getDefensa());
        dto.setEsCantante(monstruoSincronia.getEsCantante());

        return dto;
    }

    @Override
    protected MonstruoSincronia convertToEntity(MonstruoSincroniaDTO dto) {

        return new MonstruoSincroniaBuilder()

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
