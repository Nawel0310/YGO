package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoDeEfecto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonstruoDeEfectoRepository extends MonstruoConNivelYDefensaRepository<MonstruoDeEfecto> {
    List<MonstruoDeEfecto> findByTipoEspecialMonstruoEfecto();
}
