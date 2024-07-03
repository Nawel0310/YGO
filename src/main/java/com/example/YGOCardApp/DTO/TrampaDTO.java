package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Trampa.enums.TipoTrampa;

public class TrampaDTO {
    private Integer id;
    private String nombre;
    private String efecto;
    private TipoTrampa tipoTrampa;

    public TipoTrampa getTipoTrampa() {
        return tipoTrampa;
    }

    public void setTipoTrampa(TipoTrampa tipoTrampa) {
        this.tipoTrampa = tipoTrampa;
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
