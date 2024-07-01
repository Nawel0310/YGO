package com.example.YGOCardApp.repository;

import com.example.YGOCardApp.entities.CardBuilder.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean //Le indicamos a Spring que no debe instanciar este repo directamente
public interface CartaRepository<T extends Carta> extends JpaRepository<T, Integer> { }
