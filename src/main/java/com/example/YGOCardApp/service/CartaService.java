package com.example.YGOCardApp.service;

import com.example.YGOCardApp.entities.CardBuilder.Carta;
import com.example.YGOCardApp.repository.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public abstract class CartaService<T, S extends Carta> {

    protected final CartaRepository<S> repository;

    @Autowired
    public CartaService(CartaRepository<S> repository) {
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

    public List<T> findByNombre(String nombre) {
        List<S> cartas = repository.findByNombre(nombre);
        return cartas.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<T> findByEfecto(String efecto) {
        List<S> cartas = repository.findByEfecto(efecto);
        return cartas.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<T> findAllByIdIn(List<Integer> ids) {
        List<S> cartas = repository.findAllById(ids);
        return cartas.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    protected abstract T convertToDTO(S carta);

    protected abstract S convertToEntity(T cartaDTO);
}


