package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Magica.Magica;
import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MagicaRepository extends CartaRepository<Magica> {
    List<Magica> findByTipoMagica(TipoMagica tipoMagica);
}
