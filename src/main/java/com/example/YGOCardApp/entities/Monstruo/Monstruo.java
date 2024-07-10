package com.example.YGOCardApp.entities.Monstruo;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import com.example.YGOCardApp.entities.CardBuilder.Carta;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


@Entity
public abstract class Monstruo extends Carta{
    @Enumerated(EnumType.STRING)
    protected Atributo atributo;
    @Enumerated(EnumType.STRING)
    protected TipoMonstruo tipoMonstruo;
    protected Integer ataque;
    protected Boolean poseeEfecto;

    public Atributo getAtributo() {
        return atributo;
    }

    public TipoMonstruo getTipoMonstruo() {
        return tipoMonstruo;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public Boolean getPoseeEfecto() {
        return poseeEfecto;
    }
}
