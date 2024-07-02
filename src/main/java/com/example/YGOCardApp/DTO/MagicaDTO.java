package com.example.YGOCardApp.DTO;

import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;


public class MagicaDTO extends CartaDTO {
    private TipoMagica tipoMagica;

    public TipoMagica getTipoMagica() {
        return tipoMagica;
    }

    public void setTipoMagica(TipoMagica tipoMagica) {
        this.tipoMagica = tipoMagica;
    }
}
