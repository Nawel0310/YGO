package com.example.YGOCardApp.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.Monstruo.enums.Atributo;
import com.example.YGOCardApp.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.Monstruo.enums.TipoMonstruo;

public class MonstruoFusion extends MonstruoConNivelYDefensa{
    public MonstruoFusion(Integer id, Integer ataque, Integer defensa,
                          Atributo atributo, TipoMonstruo tipoMonstruo,
                          String efecto, Integer nivel, Boolean esCantante,
                          Boolean poseeEfecto) {
        this.id=id;
        this.ataque=ataque;
        this.defensa=defensa;
        this.atributo=atributo;
        this.tipoMonstruo=tipoMonstruo;
        this.efecto=efecto;
        this.nivel=nivel;
        this.esCantante=esCantante;
        this.poseeEfecto=poseeEfecto;
    }
}
