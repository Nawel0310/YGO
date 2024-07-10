package com.example.YGOCardApp.entities.Monstruo;


import jakarta.persistence.Entity;

@Entity
public abstract class MonstruoConNivelYDefensa extends Monstruo {
    protected Integer nivel;
    protected Integer defensa;
    protected Boolean esCantante;
    public Integer getNivel() {
        return nivel;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public Boolean getEsCantante() {
        return esCantante;
    }

}
