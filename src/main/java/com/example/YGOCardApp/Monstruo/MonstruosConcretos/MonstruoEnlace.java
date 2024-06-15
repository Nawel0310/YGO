package com.example.YGOCardApp.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.Monstruo.enums.Atributo;
import com.example.YGOCardApp.Monstruo.Monstruo;
import com.example.YGOCardApp.Monstruo.enums.TipoMonstruo;

public class MonstruoEnlace extends Monstruo {
    Integer flechas;

    public MonstruoEnlace(Integer id, Integer ataque,
                          Atributo atributo, TipoMonstruo tipoMonstruo,
                          String efecto, Boolean poseeEfecto, Integer flechas) {
        this.id=id;
        this.ataque=ataque;
        this.atributo=atributo;
        this.tipoMonstruo=tipoMonstruo;
        this.efecto=efecto;
        this.poseeEfecto=poseeEfecto;
        this.flechas=flechas;
    }

    public Integer getFlechas() {
        return flechas;
    }
}
