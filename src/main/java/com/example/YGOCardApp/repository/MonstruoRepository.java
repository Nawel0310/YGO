package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.Monstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonstruoRepository<S extends Monstruo> extends JpaRepository<S, Integer> {
    List<S> findByAtributo(Atributo atributo);
    List<S> findByTipoMonstruo(TipoMonstruo tipoMonstruo);
    List<S> findByAtaque(Integer ataque);
    List<S> findByPoseeEfecto(Boolean poseeEfecto);
}

