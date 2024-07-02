package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.Monstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonstruoRepository extends CartaRepository<Monstruo> {
    List<Monstruo> findByAtributo(Atributo atributo);
    List<Monstruo> findByTipoMonstruo(TipoMonstruo tipoMonstruo);
    List<Monstruo> findByAtaque(Integer ataque);
    List<Monstruo> findByPoseeEfecto(Boolean poseeEfecto);
}
