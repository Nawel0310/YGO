package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.MagicaDTO;
import com.example.YGOCardApp.entities.CardBuilder.Carta;
import com.example.YGOCardApp.entities.Magica.Magica;
import com.example.YGOCardApp.entities.Magica.MagicasBuilder.MagicaBuilder;
import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;
import com.example.YGOCardApp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MagicaService extends CartaService<MagicaDTO, Magica> {

    private final MagicaRepository magicaRepository;

    @Autowired
    public MagicaService(MagicaRepository magicaRepository) {
        super(magicaRepository);
        this.magicaRepository = magicaRepository;
    }

    @Override
    protected MagicaDTO convertToDTO(Magica magica) {
        MagicaDTO magicaDTO = new MagicaDTO();
        magicaDTO.setId(magica.getId());
        magicaDTO.setNombre(magica.getNombre());
        magicaDTO.setEfecto(magica.getEfecto());
        magicaDTO.setTipoMagica(magica.getTipoMagica());
        return magicaDTO;
    }

    @Override
    protected Magica convertToEntity(MagicaDTO cartaDTO) {
        return new MagicaBuilder()
                .setId(cartaDTO.getId())
                .setNombre(cartaDTO.getNombre())
                .setEfecto(cartaDTO.getEfecto())
                .setTipoMagica(cartaDTO.getTipoMagica())
                .build();
    }

    public List<MagicaDTO> getMagicasByTipo(TipoMagica tipoMagica) {
        List<Magica> magicas = magicaRepository.findByTipoMagica(tipoMagica);
        return magicas.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}


