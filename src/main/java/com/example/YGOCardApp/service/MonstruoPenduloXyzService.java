package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoPenduloXyzDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoPenduloXyzBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoPenduloXyz;
import com.example.YGOCardApp.repository.MonstruoPenduloXyzRepository;
import com.example.YGOCardApp.repository.MonstruoXyzRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class MonstruoPenduloXyzService extends MonstruoXyzService{
    private final MonstruoPenduloXyzRepository monstruoPenduloXyzRepository;

    @Autowired
    public MonstruoPenduloXyzService(MonstruoXyzRepository monstruoXyzRepository, MonstruoPenduloXyzRepository monstruoPenduloXyzRepository) {
        super(monstruoXyzRepository);
        this.monstruoPenduloXyzRepository=monstruoPenduloXyzRepository;
    }

    public List<MonstruoPenduloXyzDTO> getMonstruosByEscala(Integer escala) {
        List<MonstruoPenduloXyz> monstruosPenduloXyz = monstruoPenduloXyzRepository.findByEscala(escala);
        return monstruosPenduloXyz.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    protected MonstruoPenduloXyzDTO convertToDTO(MonstruoPenduloXyz monstruoPenduloXyz) {
        MonstruoPenduloXyzDTO dto = new MonstruoPenduloXyzDTO();
        dto.setId(monstruoPenduloXyz.getId());
        dto.setNombre(monstruoPenduloXyz.getNombre());
        dto.setEfecto(monstruoPenduloXyz.getEfecto());
        dto.setAtributo(monstruoPenduloXyz.getAtributo());
        dto.setTipoMonstruo(monstruoPenduloXyz.getTipoMonstruo());
        dto.setAtaque(monstruoPenduloXyz.getAtaque());
        dto.setPoseeEfecto(monstruoPenduloXyz.getPoseeEfecto());
        dto.setRango(monstruoPenduloXyz.getRango());
        dto.setDefensa(monstruoPenduloXyz.getDefensa());
        dto.setEscala(monstruoPenduloXyz.getEscala());
        dto.setEfectoPendulo(monstruoPenduloXyz.getEfectoPendulo());
        return dto;
    }

    protected MonstruoPenduloXyz convertToEntity(MonstruoPenduloXyzDTO dto) {
        return new MonstruoPenduloXyzBuilder()
                .setId(dto.getId())
                .setAtaque(dto.getAtaque())
                .setDefensa(dto.getDefensa())
                .setAtributo(dto.getAtributo())
                .setEfecto(dto.getEfecto())
                .setNombre(dto.getNombre())
                .setPoseeEfecto(dto.getPoseeEfecto())
                .setTipoMonstruo(dto.getTipoMonstruo())
                .setRango(dto.getRango())
                .setEscala(dto.getEscala())
                .setEfectoPendulo(dto.getEfectoPendulo())
                .build();
    }


}
