package com.example.YGOCardApp.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.Monstruo.MonstruosConcretos.MonstruoNormal;
import com.example.YGOCardApp.Monstruo.enums.Atributo;
import com.example.YGOCardApp.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.Monstruo.enums.TipoMonstruo;

public class MonstruoNormalBuilder extends MonstruoConNivelYDefensa implements MonstruoConNivelYDefensaBuilder<MonstruoNormal> {
    @Override
    public MonstruoNormalBuilder setAtributo(Atributo atributo) {
        this.atributo = atributo;
        return this;
    }

    @Override
    public MonstruoNormalBuilder setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo = tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoNormalBuilder setAtaque(Integer ataque) {
        this.ataque = ataque;
        return this;
    }

    @Override
    public MonstruoNormalBuilder setNivel(Integer nivel) {
        this.nivel = nivel;
        return this;
    }

    @Override
    public MonstruoNormalBuilder setDefensa(Integer defensa) {
        this.defensa = defensa;
        return this;
    }

    @Override
    public MonstruoNormalBuilder setCantante(Boolean esCantante) {
        this.esCantante = esCantante;
        return this;
    }

    @Override
    public MonstruoNormalBuilder setPoseeEfecto(Boolean poseeEfecto) {
        return this;
    }

    @Override
    public MonstruoNormalBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public MonstruoNormalBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public MonstruoNormalBuilder setEfecto(String efecto) {
        this.efecto = efecto;
        return this;
    }

    @Override
    public MonstruoNormal build() {
        return new MonstruoNormal(id, ataque, defensa, atributo, tipoMonstruo, efecto, nivel, esCantante);
    }

}
