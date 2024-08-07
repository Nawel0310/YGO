package com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoSincronia;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

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
        return new MonstruoSincronia(id,nombre,ataque,defensa,atributo,tipoMonstruo,efecto,nivel,esCantante,poseeEfecto);
    }


}
