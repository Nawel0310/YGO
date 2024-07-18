package com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class MonstruoPenduloXyz extends MonstruoXyz {
    Integer escala;
    @Column(length = 1000)
    String efectoPendulo;

    public MonstruoPenduloXyz(Integer id, String nombre, Integer ataque, Integer defensa,
                              Atributo atributo, TipoMonstruo tipoMonstruo,
                              String efecto, Boolean poseeEfecto, Integer rango,
                              Integer escala, String efectoPendulo) {
        super(id,nombre, ataque, defensa, atributo, tipoMonstruo, efecto, poseeEfecto, rango);
        this.escala = escala;
        this.efectoPendulo = efectoPendulo;
    }

    public Integer getEscala() {
        return escala;
    }
    public String getEfectoPendulo() {
        return efectoPendulo;
    }
}
