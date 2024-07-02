package com.example.YGOCardApp.service;

import com.example.YGOCardApp.DTO.CartaDTO;
import com.example.YGOCardApp.DTO.MagicaDTO;
import com.example.YGOCardApp.DTO.MonstruoDTO;
import com.example.YGOCardApp.DTO.TrampaDTO;
import com.example.YGOCardApp.entities.CardBuilder.Carta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartaServiceFactory {

    @Autowired
    private MagicaService magicaService;

    @Autowired
    private TrampaService trampaService;

    @Autowired
    private MonstruoService monstruoService;

    public <T extends CartaDTO, S extends Carta> CartaService<T , S> getServiceForCarta(Class<T> dtoClass) {
        if (dtoClass == null) {
            // Por defecto, devuelve un servicio genérico o uno predeterminado
            return (CartaService<T, S>) magicaService; // Puedes elegir cualquier servicio aquí
        } else if (dtoClass.equals(MagicaDTO.class)) {
            return (CartaService<T, S>) magicaService;
        } else if (dtoClass.equals(TrampaDTO.class)) {
            return (CartaService<T, S>) trampaService;
        } else if (dtoClass.equals(MonstruoDTO.class)) {
            return (CartaService<T, S>) magicaService;//CAMBIAR MAS ADELANTE
            /*return (CartaService<T, S>) monstruoService;*/
        } else {
            throw new IllegalArgumentException("Tipo de carta no soportado: " + dtoClass.getSimpleName());
        }
    }
}



