package com.example.YGOCardApp.entities.CardBuilder;

public interface CartaBuilder<T extends Carta> {

    CartaBuilder<T> setId (Integer id);
    CartaBuilder<T> setNombre (String nombre);
    CartaBuilder<T> setEfecto (String efecto);
    T build();
}
