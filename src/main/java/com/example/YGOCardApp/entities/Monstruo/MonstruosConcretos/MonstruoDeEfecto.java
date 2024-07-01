package com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoEspecialMonstruoEfecto;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoDeEfecto  extends MonstruoConNivelYDefensa {
    TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto;

    public MonstruoDeEfecto(Integer id, Integer ataque, Integer defensa,
                            Atributo atributo, TipoMonstruo tipoMonstruo,
                            String efecto, Integer nivel, Boolean esCantante,
                            TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto) {
        this.id=id;
        this.ataque=ataque;
        this.defensa=defensa;
        this.atributo=atributo;
        this.tipoMonstruo=tipoMonstruo;
        this.efecto=efecto;
        this.nivel=nivel;
        this.esCantante=esCantante;
        this.poseeEfecto=Boolean.TRUE;
        this.tipoEspecialMonstruoEfecto=tipoEspecialMonstruoEfecto;
    }

    public TipoEspecialMonstruoEfecto getTipoEspecialMonstruoEfecto() {
        return tipoEspecialMonstruoEfecto;
    }
}
