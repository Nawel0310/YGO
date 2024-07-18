package com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoPenduloConNivel;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoPenduloConNivelBuilder<T extends MonstruoConNivelYDefensa> extends MonstruoConNivelYDefensa implements MonstruoConNivelYDefensaBuilder<MonstruoPenduloConNivel> {
    private Integer escala;
    private String efectoPendulo;

    @Override
    public MonstruoPenduloConNivelBuilder<T> setAtributo(Atributo atributo) {
        this.atributo=atributo;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T>  setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo=tipoMonstruo;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T>  setAtaque(Integer ataque) {
        this.ataque=ataque;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T>  setNivel(Integer nivel) {
        this.nivel=nivel;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T>  setDefensa(Integer defensa) {
        this.defensa=defensa;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T>  setCantante(Boolean esCantante) {
        this.esCantante=esCantante;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T>  setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto=poseeEfecto;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T> setId(Integer id) {
        this.id= id;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T> setNombre(String nombre) {
        this.nombre= nombre;
        return this;
    }

    @Override
    public MonstruoPenduloConNivelBuilder<T> setEfecto(String efecto) {
        this.efecto=efecto;
        return this;
    }

    public MonstruoPenduloConNivelBuilder<T> setEfectoPendulo (String efectoPendulo){
        this.efectoPendulo=efectoPendulo;
        return this;
    }

    public MonstruoPenduloConNivelBuilder<T> setEscala (Integer escala){
        this.escala=escala;
        return this;
    }

    @Override
    public MonstruoPenduloConNivel<T> build() {
        return new MonstruoPenduloConNivel<>(id,nombre,ataque,defensa,atributo,tipoMonstruo,efecto,nivel,esCantante,poseeEfecto,escala,efectoPendulo);
    }
}
