package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoXyzDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoXyzBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoXyz;
import com.example.YGOCardApp.repository.MonstruoXyzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonstruoXyzService extends MonstruoService<MonstruoXyzDTO, MonstruoXyz>{

    private final MonstruoXyzRepository monstruoXyzRepository;

    @Autowired
    public MonstruoXyzService(MonstruoXyzRepository monstruoXyzRepository) {
        super(monstruoXyzRepository);
        this.monstruoXyzRepository = monstruoXyzRepository;
    }

    public List<MonstruoXyzDTO> getMonstruosByRango(Integer rango){
        List<MonstruoXyz> monstruoXyzs= monstruoXyzRepository.findByRango(rango);
        return monstruoXyzs.stream().
                map(this::convertToDTO).
                collect(Collectors.toList());
    }

    public List<MonstruoXyzDTO> getMonstruosByDefensa(Integer defensa) {
        List<MonstruoXyz> monstruos = monstruoXyzRepository.findByDefensa(defensa);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    protected MonstruoXyzDTO convertToDTO(MonstruoXyz monstruoXyz) {
        MonstruoXyzDTO dto = new MonstruoXyzDTO();
        dto.setId(monstruoXyz.getId());
        dto.setAtaque(monstruoXyz.getAtaque());
        dto.setAtributo(monstruoXyz.getAtributo());
        dto.setDefensa(monstruoXyz.getDefensa());
        dto.setTipoMonstruo(monstruoXyz.getTipoMonstruo());
        dto.setPoseeEfecto(monstruoXyz.getPoseeEfecto());
        dto.setEfecto(monstruoXyz.getEfecto());
        dto.setRango(monstruoXyz.getRango());
        dto.setNombre(monstruoXyz.getNombre());

        return dto;
    }

    @Override
    protected MonstruoXyz convertToEntity(MonstruoXyzDTO dto) {
        return new MonstruoXyzBuilder()
                .setId(dto.getId())
                .setAtaque(dto.getAtaque())
                .setDefensa(dto.getDefensa())
                .setAtributo(dto.getAtributo())
                .setEfecto(dto.getEfecto())
                .setNombre(dto.getNombre())
                .setPoseeEfecto(dto.getPoseeEfecto())
                .setTipoMonstruo(dto.getTipoMonstruo())
                .setRango(dto.getRango())
                .build();
    }
}
