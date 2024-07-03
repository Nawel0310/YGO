package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;


public class MagicaDTO{
    private Integer id;
    private String nombre;
    private String efecto;
    private TipoMagica tipoMagica;

    public TipoMagica getTipoMagica() {
        return tipoMagica;
    }

    public void setTipoMagica(TipoMagica tipoMagica) {
        this.tipoMagica = tipoMagica;
    }

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
}
