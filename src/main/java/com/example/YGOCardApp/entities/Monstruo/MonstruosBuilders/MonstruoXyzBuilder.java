package com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoXyz;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.Monstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoXyzBuilder extends Monstruo implements MonstruoBuilder<MonstruoXyz> {
    private Integer rango;
    private Integer defensa;

    @Override
    public MonstruoXyzBuilder setAtributo(Atributo atributo) {
        this.atributo=atributo;
        return this;
    }

    @Override
    public MonstruoXyzBuilder setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo=tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoXyzBuilder setAtaque(Integer ataque) {
        this.ataque=ataque;
        return this;
    }

    @Override
    public MonstruoXyzBuilder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public MonstruoXyzBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public MonstruoXyzBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    @Override
    public MonstruoXyzBuilder setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto = poseeEfecto;
        return this;
    }
    public MonstruoXyzBuilder setRango(Integer rango) {
        this.rango = rango;
        return this;
    }

    public MonstruoXyzBuilder setDefensa(Integer defensa) {
        this.defensa = defensa;
        return this;
    }

    @Override
    public MonstruoXyz build() {
        return new MonstruoXyz(id,nombre,ataque,defensa,atributo,tipoMonstruo,efecto,poseeEfecto,rango);
    }
}
