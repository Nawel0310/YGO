package com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoNormal extends MonstruoConNivelYDefensa {

    public MonstruoNormal(Integer id, Integer ataque, Integer defensa,
                          Atributo atributo, TipoMonstruo tipoMonstruo,
                          String efecto, Integer nivel, Boolean esCantante) {
        this.id=id;
        this.ataque=ataque;
        this.defensa=defensa;
        this.atributo=atributo;
        this.tipoMonstruo=tipoMonstruo;
        this.efecto=efecto;
        this.nivel=nivel;
        this.esCantante=esCantante;
        this.poseeEfecto=Boolean.FALSE;
    }


}
