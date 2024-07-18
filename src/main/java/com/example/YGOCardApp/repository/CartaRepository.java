package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.CardBuilder.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface CartaRepository<T extends Carta> extends JpaRepository<T, Integer> {
    Optional<T> findById(Integer id);
    List<T> findByNombre(String nombre);
    List<T> findByEfecto(String efecto);
}
