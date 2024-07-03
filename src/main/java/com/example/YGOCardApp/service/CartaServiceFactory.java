package com.example.YGOCardApp.service;

import org.springframework.stereotype.Component;

@Component
public class CartaServiceFactory {
    /*

    @Autowired
    private MagicaService magicaService;

    @Autowired
    private TrampaService trampaService;

    @Autowired
    private MonstruoService monstruoService;

    public <T, S extends Carta> CartaService<T , S> getServiceForCarta(Class<T> dtoClass) {
        if (dtoClass == null) {
            // Por defecto, devuelve un servicio genérico o uno predeterminado
            return (CartaService<T, S>) magicaService; // Puedes elegir cualquier servicio aquí
        } else if (dtoClass.equals(MagicaDTO.class)) {
            return (CartaService<T, S>) magicaService;
        } else if (dtoClass.equals(TrampaDTO.class)) {
            return (CartaService<T, S>) trampaService;
        } else if (dtoClass.equals(MonstruoDTO.class)) {
            return (CartaService<T, S>) monstruoService;
        } else {
            throw new IllegalArgumentException("Tipo de carta no soportado: " + dtoClass.getSimpleName());
        }
    }

     */
}



