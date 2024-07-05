package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoXyz;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonstruoXyzRepository extends MonstruoRepository<MonstruoXyz>{

    List<MonstruoXyz> findByRango(Integer rango);
    List<MonstruoXyz> findByDefensa(Integer defensa);

}
