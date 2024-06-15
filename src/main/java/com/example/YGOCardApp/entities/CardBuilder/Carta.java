package com.example.YGOCardApp.entities.CardBuilder;

public abstract class Carta {
    protected Integer id;
    protected String nombre;
    protected String efecto;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEfecto() {
        return efecto;
    }
}
