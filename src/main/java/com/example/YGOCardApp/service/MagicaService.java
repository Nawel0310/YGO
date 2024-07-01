package com.example.YGOCardApp.service;

import com.example.YGOCardApp.entities.Magica.Magica;
import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;
import com.example.YGOCardApp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class MagicaService extends CartaService<Magica>{

    private final MagicaRepository magicaRepository;

    @Autowired
    public MagicaService(JpaRepository<Magica, Integer> repository, MagicaRepository magicaRepository) {
        super(repository);
        this.magicaRepository = magicaRepository;
    }
    public List<Magica> getMagicasByTipo(TipoMagica tipoMagica) {
        return magicaRepository.findByTipoMagica(tipoMagica);
    }

}
