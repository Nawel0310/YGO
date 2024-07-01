package com.example.YGOCardApp.service;

import com.example.YGOCardApp.entities.CardBuilder.Carta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class CartaService<T extends Carta> {
    protected final JpaRepository<T, Integer> repository;

    @Autowired
    public CartaService(JpaRepository<T, Integer> repository) {
        this.repository = repository;
    }

    public T saveCarta(T carta) {
        return repository.save(carta);
    }

    public List<T> getAllCartas() {
        return repository.findAll();
    }

    public Optional<T> getCartaById(Integer id) {
        return repository.findById(id);
    }

    public void deleteCarta(Integer id) {
        repository.deleteById(id);
    }
}
