package com.example.YGOCardApp.Monstruo;

import com.example.YGOCardApp.entities.CardBuilder.Carta;
import com.example.YGOCardApp.entities.CardBuilder.CartaBuilder;

public interface MonstruoBuilder<T extends Monstruo> extends CartaBuilder<T> {
    MonstruoBuilder<T> setAtributo(Atributo atributo);
    MonstruoBuilder<T> setTipoMonstruo(TipoMonstruo tipoMonstruo);
    MonstruoBuilder<T> setAtaque(Integer ataque);
    MonstruoBuilder<T> setPoseeEfecto (Boolean poseeEfecto);
}
