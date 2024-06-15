package com.example.YGOCardApp.Trampa.TrampasBuilder;

import com.example.YGOCardApp.Trampa.Trampa;
import com.example.YGOCardApp.Trampa.enums.TipoTrampa;
import com.example.YGOCardApp.entities.CardBuilder.CartaBuilder;

public class TrampaBuilder implements CartaBuilder<Trampa> {
    private Integer id;
    private String nombre;
    private String efecto;
    private TipoTrampa tipoTrampa;

    @Override
    public TrampaBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public TrampaBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public TrampaBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    public TrampaBuilder setTipoTrampa(TipoTrampa tipoTrampa) {
        this.tipoTrampa=tipoTrampa;
        return this;
    }

    @Override
    public Trampa build() {
        return new Trampa(id,nombre,efecto,tipoTrampa);
    }
}
