package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;

public class MagicaDTO {
    private String nombre;
    private String efecto;
    private TipoMagica tipoMagica;

    // Getters and setters

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

    public TipoMagica getTipoMagica() {
        return tipoMagica;
    }

    public void setTipoMagica(TipoMagica tipoMagica) {
        this.tipoMagica = tipoMagica;
    }
}
