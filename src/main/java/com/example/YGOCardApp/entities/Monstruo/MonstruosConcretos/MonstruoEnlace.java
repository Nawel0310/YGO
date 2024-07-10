package com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.Monstruo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import jakarta.persistence.Entity;


@Entity
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
