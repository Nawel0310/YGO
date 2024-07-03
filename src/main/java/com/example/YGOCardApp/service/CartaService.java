package com.example.YGOCardApp.service;

import com.example.YGOCardApp.entities.CardBuilder.Carta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class CartaService<T, S extends Carta> {

    protected final JpaRepository<S, Integer> repository;

    @Autowired
    public CartaService(JpaRepository<S, Integer> repository) {
        this.repository = repository;
    }

    public T saveCarta(T cartaDTO) {
        S carta = convertToEntity(cartaDTO);
        carta = repository.save(carta);
        return convertToDTO(carta);
    }

    public List<T> getAllCartas() {
        List<S> cartas = repository.findAll();
        return cartas.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Optional<T> getCartaById(Integer id) {
        Optional<S> carta = repository.findById(id);
        return carta.map(this::convertToDTO);
    }

    public void deleteCarta(Integer id) {
        repository.deleteById(id);
    }

    protected abstract T convertToDTO(S carta);

    protected abstract S convertToEntity(T cartaDTO);
}

