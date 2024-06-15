package com.example.YGOCardApp.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.Monstruo.Atributo;
import com.example.YGOCardApp.Monstruo.Monstruo;
import com.example.YGOCardApp.Monstruo.TipoMonstruo;

public class MonstruoXyz extends Monstruo {
    Integer rango;
    Integer defensa;
    Boolean poseeEfecto;

    public MonstruoXyz(Integer id, Integer ataque, Integer defensa,
                       Atributo atributo, TipoMonstruo tipoMonstruo,
                       String efecto, Boolean poseeEfecto, Integer rango) {
        this.id=id;
        this.ataque=ataque;
        this.defensa=defensa;
        this.atributo=atributo;
        this.tipoMonstruo=tipoMonstruo;
        this.efecto=efecto;
        this.poseeEfecto=poseeEfecto;
        this.rango=rango;
    }

    public Integer getRango() {
        return rango;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public Boolean getPoseeEfecto() {
        return poseeEfecto;
    }
}
