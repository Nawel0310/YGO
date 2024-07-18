package com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoEspecialMonstruoEfecto;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class MonstruoRitual extends MonstruoConNivelYDefensa {

    @Enumerated(EnumType.STRING)
    TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto;

    public MonstruoRitual(Integer id, String nombre, Integer ataque, Integer defensa,
                          Atributo atributo, TipoMonstruo tipoMonstruo,
                          String efecto, Integer nivel, Boolean esCantante,
                          Boolean poseeEfecto, TipoEspecialMonstruoEfecto tipoEspecialMonstruoEfecto) {
        this.id=id;
        this.nombre=nombre;
        this.ataque=ataque;
        this.defensa=defensa;
        this.atributo=atributo;
        this.tipoMonstruo=tipoMonstruo;
        this.efecto=efecto;
        this.nivel=nivel;
        this.esCantante=esCantante;
        this.poseeEfecto=poseeEfecto;
        this.tipoEspecialMonstruoEfecto=tipoEspecialMonstruoEfecto;
    }

    public TipoEspecialMonstruoEfecto getTipoEspecialMonstruoEfecto() {
        return tipoEspecialMonstruoEfecto;
    }
}
