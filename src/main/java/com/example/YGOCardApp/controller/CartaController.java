package com.example.YGOCardApp.controller;

import com.example.YGOCardApp.DTO.*;
import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoFusion;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoRitual;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoEspecialMonstruoEfecto;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import com.example.YGOCardApp.entities.Trampa.enums.TipoTrampa;
import com.example.YGOCardApp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/carta")
public class CartaController {

    private final MagicaService magicaService;
    private final TrampaService trampaService;
    private final MonstruoNormalService monstruoNormalService;
    private final MonstruoDeEfectoService monstruoDeEfectoService;
    private final MonstruoRitualService monstruoRitualService;
    private final MonstruoFusionService monstruoFusionService;
    private final MonstruoSincroniaService monstruoSincroniaService;
    private final MonstruoXyzService monstruoXyzService;
    private final MonstruoEnlaceService monstruoEnlaceService;

    //Monstruos Péndulo:
    private final MonstruoPenduloConNivelService<MonstruoRitual> monstruoRitualPenduloConNivelService;
    private final MonstruoPenduloConNivelService<MonstruoFusion> monstruoFusionPenduloConNivelService;


    @Autowired
    public CartaController(MagicaService magicaService, TrampaService trampaService,
                           MonstruoNormalService monstruoNormalService,
                           MonstruoDeEfectoService monstruoDeEfectoService,
                           MonstruoRitualService monstruoRitualService,
                           MonstruoFusionService monstruoFusionService,
                           MonstruoSincroniaService monstruoSincroniaService,
                           MonstruoXyzService monstruoXyzService,
                           MonstruoEnlaceService monstruoEnlaceService,
                           MonstruoPenduloConNivelService<MonstruoRitual> monstruoRitualPenduloConNivelService,
                           MonstruoPenduloConNivelService<MonstruoFusion> monstruoFusionPenduloConNivelService) {
        this.magicaService = magicaService;
        this.trampaService = trampaService;
        this.monstruoNormalService = monstruoNormalService;
        this.monstruoDeEfectoService = monstruoDeEfectoService;
        this.monstruoRitualService = monstruoRitualService;
        this.monstruoFusionService = monstruoFusionService;
        this.monstruoSincroniaService = monstruoSincroniaService;
        this.monstruoXyzService = monstruoXyzService;
        this.monstruoEnlaceService = monstruoEnlaceService;
        this.monstruoRitualPenduloConNivelService = monstruoRitualPenduloConNivelService;
        this.monstruoFusionPenduloConNivelService = monstruoFusionPenduloConNivelService;
    }


    @PostMapping("/saveMagica")
    public ResponseEntity<MagicaDTO> saveMagica(@RequestBody MagicaDTO magicaDTO) {
        MagicaDTO savedMagica = magicaService.saveCarta(magicaDTO);
        return ResponseEntity.ok(savedMagica);//Devuelve un código 200 OK
    }

    @PostMapping("/saveTrampa")
    public ResponseEntity<TrampaDTO> saveTrampa(@RequestBody TrampaDTO trampaDTO) {
        TrampaDTO savedTrampa = trampaService.saveCarta(trampaDTO);
        return ResponseEntity.ok(savedTrampa);
    }

    @PostMapping("/saveMonstruoNormal")
    public ResponseEntity<MonstruoNormalDTO> saveMonstruoNormal(@RequestBody MonstruoNormalDTO monstruoNormalDTO) {
        MonstruoNormalDTO savedMonstruoNormal = monstruoNormalService.saveCarta(monstruoNormalDTO);
        return ResponseEntity.ok(savedMonstruoNormal);
    }

    @PostMapping("/saveMonstruoDeEfecto")
    public ResponseEntity<MonstruoDeEfectoDTO> saveMonstruoDeEfecto(@RequestBody MonstruoDeEfectoDTO monstruoDeEfectoDTO) {
        MonstruoDeEfectoDTO savedMonstruoDeEfecto = monstruoDeEfectoService.saveCarta(monstruoDeEfectoDTO);
        return ResponseEntity.ok(savedMonstruoDeEfecto);
    }

    @PostMapping("/saveMonstruoRitual")
    public ResponseEntity<MonstruoRitualDTO> saveMonstruoRitual(@RequestBody MonstruoRitualDTO monstruoRitualDTO) {
        MonstruoRitualDTO savedMonstruoRitual = monstruoRitualService.saveCarta(monstruoRitualDTO);
        return ResponseEntity.ok(savedMonstruoRitual);
    }

    @PostMapping("/saveMonstruoFusion")
    public ResponseEntity<MonstruoFusionDTO> saveMonstruoFusion(@RequestBody MonstruoFusionDTO monstruoFusionDTO) {
        MonstruoFusionDTO savedMonstruoFusion = monstruoFusionService.saveCarta(monstruoFusionDTO);
        return ResponseEntity.ok(savedMonstruoFusion);
    }

    @PostMapping("/saveMonstruoSincronia")
    public ResponseEntity<MonstruoSincroniaDTO> saveMonstruoSincronia(@RequestBody MonstruoSincroniaDTO monstruoSincroniaDTO) {
        MonstruoSincroniaDTO savedMonstruoSincronia = monstruoSincroniaService.saveCarta(monstruoSincroniaDTO);
        return ResponseEntity.ok(savedMonstruoSincronia);
    }

    @PostMapping("/saveMonstruoXyz")
    public ResponseEntity<MonstruoXyzDTO> saveMonstruoXyz(@RequestBody MonstruoXyzDTO monstruoXyzDTO) {
        MonstruoXyzDTO savedMonstruoXyz = monstruoXyzService.saveCarta(monstruoXyzDTO);
        return ResponseEntity.ok(savedMonstruoXyz);
    }

    @PostMapping("/saveMonstruoEnlace")
    public ResponseEntity<MonstruoEnlaceDTO> saveMonstruoEnlace(@RequestBody MonstruoEnlaceDTO monstruoEnlaceDTO) {
        MonstruoEnlaceDTO savedMonstruoEnlace = monstruoEnlaceService.saveCarta(monstruoEnlaceDTO);
        return ResponseEntity.ok(savedMonstruoEnlace);
    }

    @PostMapping("/saveMonstruoRitualPenduloConNivel")
    public ResponseEntity<MonstruoPenduloConNivelDTO> saveMonstruoRitualPenduloConNivel(@RequestBody MonstruoPenduloConNivelDTO monstruoPenduloConNivelDTO) {
        MonstruoPenduloConNivelDTO savedMonstruoPenduloConNivel = monstruoRitualPenduloConNivelService.saveCarta(monstruoPenduloConNivelDTO);
        return ResponseEntity.ok(savedMonstruoPenduloConNivel);
    }

    @PostMapping("/saveMonstruoFusionPenduloConNivel")
    public ResponseEntity<MonstruoPenduloConNivelDTO> saveMonstruoFusionPenduloConNivel(@RequestBody MonstruoPenduloConNivelDTO monstruoPenduloConNivelDTO) {
        MonstruoPenduloConNivelDTO savedMonstruoPenduloConNivel = monstruoFusionPenduloConNivelService.saveCarta(monstruoPenduloConNivelDTO);
        return ResponseEntity.ok(savedMonstruoPenduloConNivel);
    }
}



