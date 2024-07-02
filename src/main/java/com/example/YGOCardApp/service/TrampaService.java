package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.TrampaDTO;
import com.example.YGOCardApp.entities.Trampa.Trampa;
import com.example.YGOCardApp.entities.Trampa.TrampasBuilder.TrampaBuilder;
import com.example.YGOCardApp.entities.Trampa.enums.TipoTrampa;
import com.example.YGOCardApp.repository.TrampaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrampaService extends CartaService<TrampaDTO, Trampa> {

    private final TrampaRepository trampaRepository;

    @Autowired
    public TrampaService(TrampaRepository trampaRepository) {
        super(trampaRepository);
        this.trampaRepository = trampaRepository;
    }

    @Override
    protected TrampaDTO convertToDTO(Trampa trampa) {
        TrampaDTO trampaDTO = new TrampaDTO();
        trampaDTO.setId(trampa.getId());
        trampaDTO.setNombre(trampa.getNombre());
        trampaDTO.setEfecto(trampa.getEfecto());
        trampaDTO.setTipoTrampa(trampa.getTipoTrampa());
        return trampaDTO;
    }

    @Override
    protected Trampa convertToEntity(TrampaDTO trampaDTO) {
        return new TrampaBuilder()
                .setId(trampaDTO.getId())
                .setNombre(trampaDTO.getNombre())
                .setEfecto(trampaDTO.getEfecto())
                .setTipoTrampa(trampaDTO.getTipoTrampa())
                .build();
    }

    public List<TrampaDTO> getTrampasByTipo(TipoTrampa tipoTrampa) {
        List<Trampa> trampas = trampaRepository.findByTipoTrampa(tipoTrampa);
        return trampas.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}
