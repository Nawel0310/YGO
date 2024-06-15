package com.example.YGOCardApp.Magica;

import com.example.YGOCardApp.entities.CardBuilder.CartaBuilder;

public class MagicaBuilder implements CartaBuilder<Magica>{
    private Integer id;
    private String nombre;
    private String efecto;
    private TipoMagica tipoMagica;


    @Override
    public MagicaBuilder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public MagicaBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public MagicaBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    public MagicaBuilder setTipoMagica (TipoMagica tipoMagica){
        this.tipoMagica=tipoMagica;
        return this;
    }

    @Override
    public Magica build() {
        return new Magica(id,nombre,efecto,tipoMagica);
    }
}
