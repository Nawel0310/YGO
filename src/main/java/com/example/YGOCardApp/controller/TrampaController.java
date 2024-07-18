package com.example.YGOCardApp.controller;

import com.example.YGOCardApp.DTO.TrampaDTO;
import com.example.YGOCardApp.entities.Trampa.Trampa;
import com.example.YGOCardApp.entities.Trampa.TrampasBuilder.TrampaBuilder;
import com.example.YGOCardApp.entities.Trampa.enums.TipoTrampa;
import com.example.YGOCardApp.service.TrampaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trampa")
public class TrampaController {

    private final TrampaService trampaService;

    @Autowired
    public TrampaController(TrampaService trampaService) {
        this.trampaService = trampaService;
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("trampa", new TrampaDTO());
        model.addAttribute("tiposTrampa", TipoTrampa.values());
        return "trampa-form";
    }

    @PostMapping("/save")
    public String saveTrampa(@ModelAttribute("trampa") TrampaDTO trampaDTO) {
        Trampa trampa = new TrampaBuilder()
                .setId(trampaDTO.getId())
                .setNombre(trampaDTO.getNombre())
                .setEfecto(trampaDTO.getEfecto())
                .setTipoTrampa(trampaDTO.getTipoTrampa())
                .build();
        trampaService.saveCarta(trampaDTO);
        return "redirect:/trampa/new?success";
    }

}
