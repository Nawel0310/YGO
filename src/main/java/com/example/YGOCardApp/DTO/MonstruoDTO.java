package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoDTO extends CartaDTO{
    private Atributo atributo;
    private TipoMonstruo tipoMonstruo;
    private Integer ataque;
    private Boolean poseeEfecto;

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    public TipoMonstruo getTipoMonstruo() {
        return tipoMonstruo;
    }

    public void setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo = tipoMonstruo;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Boolean getPoseeEfecto() {
        return poseeEfecto;
    }

    public void setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto = poseeEfecto;
    }
}
