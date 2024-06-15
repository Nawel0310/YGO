package com.example.YGOCardApp.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.Monstruo.*;
import com.example.YGOCardApp.Monstruo.MonstruosConcretos.MonstruoFusion;
import com.example.YGOCardApp.Monstruo.enums.Atributo;
import com.example.YGOCardApp.Monstruo.enums.TipoMonstruo;

public class MonstruoFusionBuilder extends MonstruoConNivelYDefensa implements MonstruoConNivelYDefensaBuilder<MonstruoFusion> {
    @Override
    public MonstruoFusionBuilder setAtributo(Atributo atributo) {
        this.atributo=atributo;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo=tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setAtaque(Integer ataque) {
        this.ataque=ataque;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setNivel(Integer nivel) {
        this.nivel=nivel;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setDefensa(Integer defensa) {
        this.defensa=defensa;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setCantante(Boolean esCantante) {
        this.esCantante= esCantante;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto= poseeEfecto;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public MonstruoFusionBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    @Override
    public MonstruoFusion build() {
        return new MonstruoFusion(id,ataque,defensa,atributo,tipoMonstruo,efecto,nivel,esCantante,poseeEfecto);
    }
}
