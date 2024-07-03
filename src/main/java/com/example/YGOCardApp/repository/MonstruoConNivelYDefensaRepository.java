package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonstruoConNivelYDefensaRepository<S extends MonstruoConNivelYDefensa>
        extends MonstruoRepository<S> {
    List<S> findByNivel(Integer nivel);
    List<S> findByDefensa(Integer defensa);
    List<S> findByEsCantante(Boolean esCantante);
}
