package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;

public class MonstruoPenduloConNivelDTO {
    private Integer id;
    private String nombre;
    private Integer ataque;
    private Integer defensa;
    private Atributo atributo;
    private TipoMonstruo tipoMonstruo;
    private String efecto;
    private Integer nivel;
    private Boolean esCantante;
    private Boolean poseeEfecto;
    private Integer escala;
    private String efectoPendulo;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
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

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Boolean getEsCantante() {
        return esCantante;
    }

    public void setEsCantante(Boolean esCantante) {
        this.esCantante = esCantante;
    }

    public Boolean getPoseeEfecto() {
        return poseeEfecto;
    }

    public void setPoseeEfecto(Boolean poseeEfecto) {
        this.poseeEfecto = poseeEfecto;
    }

    public Integer getEscala() {
        return escala;
    }

    public void setEscala(Integer escala) {
        this.escala = escala;
    }

    public String getEfectoPendulo() {
        return efectoPendulo;
    }

    public void setEfectoPendulo(String efectoPendulo) {
        this.efectoPendulo = efectoPendulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
