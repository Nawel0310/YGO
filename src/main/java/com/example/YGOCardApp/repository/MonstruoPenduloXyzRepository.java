package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoPenduloXyz;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoXyz;

import java.util.List;

public interface MonstruoPenduloXyzRepository extends MonstruoXyzRepository{
    List<MonstruoPenduloXyz>findByEscala(Integer escala);
}
