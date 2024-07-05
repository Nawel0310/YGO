package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoRitualDTO {

    private Integer id;
    private String nombre;
    private String efecto;
    private Atributo atributo;
    private TipoMonstruo tipoMonstruo;
    private Integer ataque;
    private Boolean poseeEfecto;
    private Integer nivel;
    private Integer defensa;
    private Boolean esCantante;

    public Boolean getEsCantante() {
        return esCantante;
    }

    public void setEsCantante(Boolean esCantante) {
        this.esCantante = esCantante;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Boolean getPoseeEfecto() {
        return poseeEfecto;
    }

    public void setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto = poseeEfecto;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public TipoMonstruo getTipoMonstruo() {
        return tipoMonstruo;
    }

    public void setTipoMonstruo(TipoMonstruo tipoMonstruo) {
        this.tipoMonstruo = tipoMonstruo;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
