package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoPenduloConNivel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonstruoPenduloConNivelRepository<T extends MonstruoConNivelYDefensa>{
    List<MonstruoPenduloConNivel<T>>findByEscala(Integer escala);

}
