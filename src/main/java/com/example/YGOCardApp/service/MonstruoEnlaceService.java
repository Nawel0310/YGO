package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoEnlaceDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoEnlaceBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoEnlace;
import com.example.YGOCardApp.repository.MonstruoEnlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class MonstruoEnlaceService extends MonstruoService<MonstruoEnlaceDTO,MonstruoEnlace>{

    private final MonstruoEnlaceRepository monstruoEnlaceRepository;

    @Autowired
    public MonstruoEnlaceService(MonstruoEnlaceRepository monstruoEnlaceRepository) {
        super(monstruoEnlaceRepository);
        this.monstruoEnlaceRepository = monstruoEnlaceRepository;
    }

    public List<MonstruoEnlaceDTO> getMonstruosByFlechas(Integer flecha){
        List<MonstruoEnlace> monstruosEnlace = monstruoEnlaceRepository.findByFlechas(flecha);
        return monstruosEnlace.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    protected MonstruoEnlaceDTO convertToDTO(MonstruoEnlace monstruoEnlace) {
       MonstruoEnlaceDTO dto = new MonstruoEnlaceDTO();
        dto.setId(monstruoEnlace.getId());
        dto.setAtaque(monstruoEnlace.getAtaque());
        dto.setAtributo(monstruoEnlace.getAtributo());
        dto.setTipoMonstruo(monstruoEnlace.getTipoMonstruo());
        dto.setPoseeEfecto(monstruoEnlace.getPoseeEfecto());
        dto.setEfecto(monstruoEnlace.getEfecto());
        dto.setFlechas(monstruoEnlace.getFlechas());
        dto.setNombre(monstruoEnlace.getNombre());
        return dto;
    }

    @Override
    protected MonstruoEnlace convertToEntity(MonstruoEnlaceDTO dto) {
        return new MonstruoEnlaceBuilder()
        .setId(dto.getId())
                .setAtaque(dto.getAtaque())
                .setAtributo(dto.getAtributo())
                .setEfecto(dto.getEfecto())
                .setNombre(dto.getNombre())
                .setPoseeEfecto(dto.getPoseeEfecto())
                .setTipoMonstruo(dto.getTipoMonstruo())
                .setFlechas(dto.getFlechas())
                .build();
    }
}
