package com.example.YGOCardApp.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.Monstruo.Atributo;
import com.example.YGOCardApp.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.Monstruo.MonstruoConNivelYDefensaBuilder;
import com.example.YGOCardApp.Monstruo.TipoMonstruo;

public class MonstruoSincroniaBuilder extends MonstruoConNivelYDefensa implements MonstruoConNivelYDefensaBuilder<MonstruoSincronia> {
    @Override
    public MonstruoSincroniaBuilder setAtributo(Atributo atributo) {
        this.atributo=atributo;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo=tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setAtaque(Integer ataque) {
        this.ataque=ataque;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setNivel(Integer nivel) {
        this.nivel=nivel;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setDefensa(Integer defensa) {
        this.defensa=defensa;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setCantante(Boolean esCantante) {
        this.esCantante= esCantante;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto= poseeEfecto;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public MonstruoSincroniaBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    @Override
    public MonstruoSincronia build() {
        return new MonstruoSincronia(id,ataque,defensa,atributo,tipoMonstruo,efecto,nivel,esCantante,poseeEfecto);
    }


}
