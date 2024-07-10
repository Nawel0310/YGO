package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoDeEfecto;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoEspecialMonstruoEfecto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonstruoDeEfectoRepository extends MonstruoConNivelYDefensaRepository<MonstruoDeEfecto> {
    List<MonstruoDeEfecto> findByTipoEspecialMonstruoEfecto(TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto);
}
