package com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoEnlace;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.Monstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

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

    public MonstruoEnlaceBuilder setFlechas (Integer flechas){
        this.flechas=flechas;
        return this;
    }

    @Override
    public MonstruoEnlace build() {
        return new MonstruoEnlace(id,nombre,ataque,atributo,tipoMonstruo,efecto,poseeEfecto,flechas);
    }

}
