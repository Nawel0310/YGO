package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Trampa.Trampa;
import com.example.YGOCardApp.entities.Trampa.enums.TipoTrampa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrampaRepository extends CartaRepository<Trampa> {
    List<Trampa> findByTipoTrampa (TipoTrampa tipoTrampa);
}
