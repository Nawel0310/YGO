package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MonstruoDeEfectoDTO;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoDeEfectoBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoDeEfecto;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoEspecialMonstruoEfecto;
import com.example.YGOCardApp.repository.MonstruoConNivelYDefensaRepository;
import com.example.YGOCardApp.repository.MonstruoDeEfectoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class MonstruoDeEfectoService extends MonstruoConNivelYDefensaService<MonstruoDeEfectoDTO, MonstruoDeEfecto>{
    private final MonstruoDeEfectoRepository monstruoDeEfectoRepository;

    @Autowired
    public MonstruoDeEfectoService(MonstruoDeEfectoRepository monstruoDeEfectoRepository) {
        super(monstruoDeEfectoRepository);
        this.monstruoDeEfectoRepository = monstruoDeEfectoRepository;
    }

    public List<MonstruoDeEfectoDTO> getMonstruosByTipoEspecialMonstruoEfecto(TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto) {
        List<MonstruoDeEfecto> monstruosDeEfecto = monstruoDeEfectoRepository.findByTipoEspecialMonstruoEfecto( tipoEspecialMonstruoEfecto);
        return monstruosDeEfecto.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    protected MonstruoDeEfectoDTO convertToDTO(MonstruoDeEfecto monstruoDeEfecto) {
        MonstruoDeEfectoDTO dto = new MonstruoDeEfectoDTO();
        dto.setId(monstruoDeEfecto.getId());
        dto.setNombre(monstruoDeEfecto.getNombre());
        dto.setEfecto(monstruoDeEfecto.getEfecto());
        dto.setAtributo(monstruoDeEfecto.getAtributo());
        dto.setTipoMonstruo(monstruoDeEfecto.getTipoMonstruo());
        dto.setAtaque(monstruoDeEfecto.getAtaque());
        dto.setNivel(monstruoDeEfecto.getNivel());
        dto.setDefensa(monstruoDeEfecto.getDefensa());
        dto.setEsCantante(monstruoDeEfecto.getEsCantante());
        dto.setTipoEspecialMonstruoEfecto(monstruoDeEfecto.getTipoEspecialMonstruoEfecto());
        return dto;
    }

    @Override
    protected MonstruoDeEfecto convertToEntity(MonstruoDeEfectoDTO dto) {
        return new MonstruoDeEfectoBuilder().setId(dto.getId())
                .setNombre(dto.getNombre())
                .setEfecto(dto.getEfecto())
                .setAtributo(dto.getAtributo())
                .setTipoMonstruo(dto.getTipoMonstruo())
                .setAtaque(dto.getAtaque())
                .setNivel(dto.getNivel())
                .setDefensa(dto.getDefensa())
                .setCantante(dto.getEsCantante())
                .setTipoEspecialMonstruoEfecto(dto.getTipoEspecialMonstruoEfecto())
                .build();
    }
}
