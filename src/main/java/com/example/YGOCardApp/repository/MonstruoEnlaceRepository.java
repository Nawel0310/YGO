package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoEnlace;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonstruoEnlaceRepository extends MonstruoRepository<MonstruoEnlace> {
    List<MonstruoEnlace> findByFlechas(Integer flecha);

}
