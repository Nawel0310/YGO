package com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class MonstruoPenduloConNivel<T extends MonstruoConNivelYDefensa> extends MonstruoConNivelYDefensa {
    Integer escala;
    @Column(length = 1000)
    String efectoPendulo;

    public Integer getEscala() {
        return escala;
    }

    public String getEfectoPendulo() {
        return efectoPendulo;
    }

    public MonstruoPenduloConNivel(Integer id, String nombre, Integer ataque, Integer defensa,
    Atributo atributo, TipoMonstruo tipoMonstruo,
    String efecto, Integer nivel, Boolean esCantante,
    Boolean poseeEfecto, Integer escala, String efectoPendulo) {
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
        this.escala=escala;
        this.efectoPendulo=efectoPendulo;
    }
}
