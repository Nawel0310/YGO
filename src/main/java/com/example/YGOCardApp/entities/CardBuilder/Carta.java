package com.example.YGOCardApp.entities.CardBuilder;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
    @Column(length = 500)
    protected String nombre;
    @Column(length = 1000)
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
