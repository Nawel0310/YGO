package com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoDeEfecto;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoEspecialMonstruoEfecto;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoDeEfectoBuilder extends MonstruoConNivelYDefensa implements MonstruoConNivelYDefensaBuilder<MonstruoDeEfecto> {

    private TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto;

    @Override
    public MonstruoDeEfectoBuilder setAtributo(Atributo atributo) {
        this.atributo=atributo;
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo=tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setAtaque(Integer ataque) {
        this.ataque=ataque;
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setNivel(Integer nivel) {
        this.nivel=nivel;
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setDefensa(Integer defensa) {
        this.defensa=defensa;
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setCantante(Boolean esCantante) {
        this.esCantante= esCantante;
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setPoseeEfecto(Boolean poseeEfecto) {
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public MonstruoDeEfectoBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    public MonstruoDeEfectoBuilder setTipoEspecialMonstruoEfecto (TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto){
        this.tipoEspecialMonstruoEfecto=tipoEspecialMonstruoEfecto;
        return this;
    }

    @Override
    public MonstruoDeEfecto build() {
        return new MonstruoDeEfecto(id,ataque,defensa,atributo,tipoMonstruo,efecto,nivel,esCantante,tipoEspecialMonstruoEfecto);
    }
}
