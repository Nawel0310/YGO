package com.example.YGOCardApp.entities.Trampa;

import com.example.YGOCardApp.entities.Trampa.enums.TipoTrampa;
import com.example.YGOCardApp.entities.CardBuilder.Carta;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Trampa extends Carta {

    @Enumerated(EnumType.STRING)
    TipoTrampa tipoTrampa;

    public Trampa(Integer id, String nombre, String efecto, TipoTrampa tipoTrampa) {
        this.id=id;
        this.nombre=nombre;
        this.efecto=efecto;
        this.tipoTrampa=tipoTrampa;
    }

    public TipoTrampa getTipoTrampa() {
        return this.tipoTrampa;
    }
}
