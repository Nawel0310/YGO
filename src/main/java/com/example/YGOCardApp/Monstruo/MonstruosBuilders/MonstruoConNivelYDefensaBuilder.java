package com.example.YGOCardApp.Monstruo.MonstruosBuilders;

import com.example.YGOCardApp.Monstruo.MonstruoConNivelYDefensa;

public interface MonstruoConNivelYDefensaBuilder<T extends MonstruoConNivelYDefensa>  extends MonstruoBuilder<T> {
    MonstruoConNivelYDefensaBuilder<T> setNivel (Integer nivel);
    MonstruoConNivelYDefensaBuilder<T> setDefensa (Integer defensa);
    MonstruoConNivelYDefensaBuilder<T> setCantante (Boolean esCantante);
    MonstruoConNivelYDefensaBuilder<T> setPoseeEfecto (Boolean poseeEfecto);
}
