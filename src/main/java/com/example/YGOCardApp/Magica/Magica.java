package com.example.YGOCardApp.Magica;

import com.example.YGOCardApp.Magica.enums.TipoMagica;
import com.example.YGOCardApp.entities.CardBuilder.Carta;

public class Magica extends Carta {
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
