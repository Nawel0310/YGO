package com.example.YGOCardApp.entities.Magica;

import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;
import com.example.YGOCardApp.entities.CardBuilder.Carta;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Magica extends Carta {

    @Enumerated(EnumType.STRING)
    TipoMagica tipoMagica;

    public Magica(Integer id, String nombre, String efecto,TipoMagica tipoMagica) {
        this.id=id;
        this.nombre=nombre;
        this.efecto=efecto;
        this.tipoMagica=tipoMagica;
    }
    public TipoMagica getTipoMagica() {
        return tipoMagica;
    }
}
