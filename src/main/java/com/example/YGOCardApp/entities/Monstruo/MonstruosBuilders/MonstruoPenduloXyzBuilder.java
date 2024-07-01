package com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoPenduloXyz;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.Monstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoPenduloXyzBuilder extends Monstruo implements MonstruoBuilder {
    private Integer escala;
    private String efectoPendulo;
    private Integer rango;
    private Integer defensa;
    private Boolean poseeEfecto;

    @Override
    public MonstruoPenduloXyzBuilder setAtributo(Atributo atributo) {
        this.atributo=atributo;
        return this;
    }

    @Override
    public MonstruoPenduloXyzBuilder setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo=tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoPenduloXyzBuilder setAtaque(Integer ataque) {
        this.ataque=ataque;
        return this;
    }

    @Override
    public MonstruoPenduloXyzBuilder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public MonstruoPenduloXyzBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public MonstruoPenduloXyzBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    @Override
    public MonstruoPenduloXyzBuilder setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto = poseeEfecto;
        return this;
    }
    public MonstruoPenduloXyzBuilder setRango(Integer rango) {
        this.rango = rango;
        return this;
    }

    public MonstruoPenduloXyzBuilder setDefensa(Integer defensa) {
        this.defensa = defensa;
        return this;
    }

    public MonstruoPenduloXyzBuilder setEscala(Integer escala) {
        this.escala = escala;
        return this;
    }

    public MonstruoPenduloXyzBuilder setEfectoPendulo(String efectoPendulo) {
        this.efectoPendulo = efectoPendulo;
        return this;
    }

    @Override
    public MonstruoPenduloXyz build() {
        return new MonstruoPenduloXyz (id,ataque, defensa, atributo, tipoMonstruo, efecto,  poseeEfecto, rango, escala,  efectoPendulo);
    }
}
