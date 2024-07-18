package com.example.YGOCardApp.controller;

import com.example.YGOCardApp.DTO.*;
import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoEspecialMonstruoEfecto;
import com.example.YGOCardApp.entities.Monstruo.enums.TipoMonstruo;
import com.example.YGOCardApp.entities.Trampa.enums.TipoTrampa;
import com.example.YGOCardApp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
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


    @Autowired
    public CartaController(MagicaService magicaService, TrampaService trampaService,
                           MonstruoNormalService monstruoNormalService,
                           MonstruoDeEfectoService monstruoDeEfectoService,
                           MonstruoRitualService monstruoRitualService,
                           MonstruoFusionService monstruoFusionService,
                           MonstruoSincroniaService monstruoSincroniaService,
                           MonstruoXyzService monstruoXyzService,
                           MonstruoEnlaceService monstruoEnlaceService) {
        this.magicaService = magicaService;
        this.trampaService = trampaService;
        this.monstruoNormalService = monstruoNormalService;
        this.monstruoDeEfectoService = monstruoDeEfectoService;
        this.monstruoRitualService = monstruoRitualService;
        this.monstruoFusionService = monstruoFusionService;
        this.monstruoSincroniaService = monstruoSincroniaService;
        this.monstruoXyzService = monstruoXyzService;
        this.monstruoEnlaceService = monstruoEnlaceService;
    }

    @GetMapping("/new")
    public String showForm(Model model) {

        model.addAttribute("magica", new MagicaDTO());
        model.addAttribute("trampa", new TrampaDTO());
        model.addAttribute("monstruoNormal", new MonstruoNormalDTO());
        model.addAttribute("monstruoDeEfecto", new MonstruoDeEfectoDTO());
        model.addAttribute("monstruoRitual", new MonstruoRitualDTO());
        model.addAttribute("monstruoFusion", new MonstruoFusionDTO());
        model.addAttribute("monstruoSincronia", new MonstruoSincroniaDTO());
        model.addAttribute("monstruoXyz", new MonstruoXyzDTO());
        model.addAttribute("monstruoEnlace", new MonstruoEnlaceDTO());

        model.addAttribute("tiposMagica", TipoMagica.values());
        model.addAttribute("tiposTrampa", TipoTrampa.values());
        model.addAttribute("tiposMonstruo", TipoMonstruo.values());
        model.addAttribute("atributos", Atributo.values());
        model.addAttribute("tiposEspecialMonstruoEfecto", TipoEspecialMonstruoEfecto.values());
        return "carta-form";
    }

    @PostMapping("/saveMagica")
    public String saveMagica(@ModelAttribute("magica") MagicaDTO magicaDTO) {
        magicaService.saveCarta(magicaDTO);
        return "redirect:/carta/new?successMagica";
    }

    @PostMapping("/saveTrampa")
    public String saveTrampa(@ModelAttribute("trampa") TrampaDTO trampaDTO) {
        trampaService.saveCarta(trampaDTO);
        return "redirect:/carta/new?successTrampa";
    }

    @PostMapping("/saveMonstruoNormal")
    public String saveMonstruoNormal(@ModelAttribute("monstruoNormal") MonstruoNormalDTO monstruoNormalDTO) {
        monstruoNormalService.saveCarta(monstruoNormalDTO);
        return "redirect:/carta/new?successMonstruoNormal";
    }

    @PostMapping("/saveMonstruoDeEfecto")
    public String saveMonstruoDeEfecto(@ModelAttribute("monstruoDeEfecto") MonstruoDeEfectoDTO monstruoDeEfectoDTO) {
        monstruoDeEfectoService.saveCarta(monstruoDeEfectoDTO);
        return "redirect:/carta/new?successMonstruoDeEfecto";
    }

    @PostMapping("/saveMonstruoRitual")
    public String saveMonstruoRitual(@ModelAttribute("monstruoRitual") MonstruoRitualDTO monstruoRitualDTO) {
        monstruoRitualService.saveCarta(monstruoRitualDTO);
        return "redirect:/carta/new?successMonstruoRitual";
    }

    @PostMapping("/saveMonstruoFusion")
    public String saveMonstruoFusion(@ModelAttribute("monstruoFusion") MonstruoFusionDTO monstruoFusionDTO) {
        monstruoFusionService.saveCarta(monstruoFusionDTO);
        return "redirect:/carta/new?successMonstruoFusion";
    }

    @PostMapping("/saveMonstruoSincronia")
    public String saveMonstruoSincronia(@ModelAttribute("monstruoSincronia") MonstruoSincroniaDTO monstruoSincroniaDTO) {
        monstruoSincroniaService.saveCarta(monstruoSincroniaDTO);
        return "redirect:/carta/new?successMonstruoSincronia";
    }

    @PostMapping("/saveMonstruoXyz")
    public String saveMonstruoXyz(@ModelAttribute("monstruoXyz") MonstruoXyzDTO monstruoXyzDTO) {
        monstruoXyzService.saveCarta(monstruoXyzDTO);
        return "redirect:/carta/new?successMonstruoXyz";
    }

    @PostMapping("/saveMonstruoEnlace")
    public String saveMonstruoEnlace(@ModelAttribute("monstruoEnlace") MonstruoEnlaceDTO monstruoEnlaceDTO) {
        monstruoEnlaceService.saveCarta(monstruoEnlaceDTO);
        return "redirect:/carta/new?successMonstruoEnlace";
    }



}


