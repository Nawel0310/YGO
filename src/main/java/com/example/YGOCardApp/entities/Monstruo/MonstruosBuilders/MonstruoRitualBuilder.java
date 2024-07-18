package com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoRitual;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoEspecialMonstruoEfecto;

public class MonstruoRitualBuilder extends MonstruoConNivelYDefensa implements MonstruoConNivelYDefensaBuilder<MonstruoRitual> {

    private TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto;

    @Override
    public MonstruoRitualBuilder setAtributo(Atributo atributo) {
        this.atributo=atributo;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo=tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setAtaque(Integer ataque) {
        this.ataque=ataque;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setNivel(Integer nivel) {
        this.nivel=nivel;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setDefensa(Integer defensa) {
        this.defensa=defensa;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setCantante(Boolean esCantante) {
        this.esCantante= esCantante;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto= poseeEfecto;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public MonstruoRitualBuilder setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    public MonstruoRitualBuilder setTipoEspecialMonstruoEfecto(TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto) {
        this.tipoEspecialMonstruoEfecto = tipoEspecialMonstruoEfecto;
        return this;
    }

    @Override
    public MonstruoRitual build() {
        return new MonstruoRitual(id,nombre,ataque,defensa,atributo,tipoMonstruo,efecto,nivel,esCantante,poseeEfecto, tipoEspecialMonstruoEfecto);
    }
}
