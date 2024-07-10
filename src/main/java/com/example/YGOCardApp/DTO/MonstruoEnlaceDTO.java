package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoEnlaceDTO {
    private Integer id;
    private String nombre;
    private String efecto;
    private Atributo atributo;
    private TipoMonstruo tipoMonstruo;
    private Integer ataque;
    private Boolean poseeEfecto;
    private Integer flechas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

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

    public Integer getFlechas() {
        return flechas;
    }

    public void setFlechas(Integer flechas) {
        this.flechas = flechas;
    }
}
