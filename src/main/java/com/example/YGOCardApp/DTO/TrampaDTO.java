package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Trampa.enums.TipoTrampa;

public class TrampaDTO extends CartaDTO {
    private TipoTrampa tipoTrampa;

    public TipoTrampa getTipoTrampa() {
        return tipoTrampa;
    }

    public void setTipoTrampa(TipoTrampa tipoTrampa) {
        this.tipoTrampa = tipoTrampa;
    }
}
