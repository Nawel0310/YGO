package com.example.YGOCardApp.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.Monstruo.MonstruosConcretos.MonstruoEnlace;
import com.example.YGOCardApp.Monstruo.enums.Atributo;
import com.example.YGOCardApp.Monstruo.Monstruo;
import com.example.YGOCardApp.Monstruo.enums.TipoMonstruo;

public class MonstruoEnlaceBuilder extends Monstruo implements MonstruoBuilder<MonstruoEnlace> {
    private Integer flechas;

    @Override
    public MonstruoEnlaceBuilder setAtributo(Atributo atributo) {
        this.atributo=atributo;
        return this;
    }

    @Override
    public MonstruoEnlaceBuilder setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo=tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoEnlaceBuilder setAtaque(Integer ataque) {
        this.ataque=ataque;
        return this;
    }

    @Override
    public MonstruoEnlaceBuilder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public MonstruoEnlaceBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public MonstruoEnlaceBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    @Override
    public MonstruoEnlaceBuilder setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto = poseeEfecto;
        return this;
    }

    public MonstruoEnlaceBuilder setFelchas (Integer flechas){
        this.flechas=flechas;
        return this;
    }

    @Override
    public MonstruoEnlace build() {
        return new MonstruoEnlace(id,ataque,atributo,tipoMonstruo,efecto,poseeEfecto,flechas);
    }

}
