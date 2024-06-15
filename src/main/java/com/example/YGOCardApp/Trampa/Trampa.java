package com.example.YGOCardApp.Trampa;

import com.example.YGOCardApp.Trampa.enums.TipoTrampa;
import com.example.YGOCardApp.entities.CardBuilder.Carta;

public class Trampa extends Carta {
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
