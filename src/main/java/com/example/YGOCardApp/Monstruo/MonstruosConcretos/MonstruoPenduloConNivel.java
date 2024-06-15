package com.example.YGOCardApp.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.Monstruo.Atributo;
import com.example.YGOCardApp.Monstruo.Monstruo;
import com.example.YGOCardApp.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.Monstruo.TipoMonstruo;

public class MonstruoPenduloConNivel<T extends MonstruoConNivelYDefensa> extends MonstruoConNivelYDefensa {
    Integer escala;
    String efectoPendulo;

    public Integer getEscala() {
        return escala;
    }

    public String getEfectoPendulo() {
        return efectoPendulo;
    }

    public MonstruoPenduloConNivel(Integer id, Integer ataque, Integer defensa,
    Atributo atributo, TipoMonstruo tipoMonstruo,
    String efecto, Integer nivel, Boolean esCantante,
    Boolean poseeEfecto, Integer escala, String efectoPendulo) {
        this.id=id;
        this.ataque=ataque;
        this.defensa=defensa;
        this.atributo=atributo;
        this.tipoMonstruo=tipoMonstruo;
        this.efecto=efecto;
        this.nivel=nivel;
        this.esCantante=esCantante;
        this.poseeEfecto=poseeEfecto;
        this.escala=escala;
        this.efectoPendulo=efectoPendulo;
    }



}
