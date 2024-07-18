package com.example.YGOCardApp.controller;



import com.example.YGOCardApp.DTO.MagicaDTO;
import com.example.YGOCardApp.entities.Magica.Magica;
import com.example.YGOCardApp.entities.Magica.MagicasBuilder.MagicaBuilder;
import com.example.YGOCardApp.entities.Magica.enums.TipoMagica;
import com.example.YGOCardApp.service.MagicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/magica")
public class MagicaController {

    private final MagicaService magicaService;

    @Autowired
    public MagicaController(MagicaService magicaService) {
        this.magicaService = magicaService;
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("magica", new MagicaDTO());
        model.addAttribute("tiposMagica", TipoMagica.values());
        return "magica-form";
    }

    @PostMapping("/save")
    public String saveMagica(@ModelAttribute("magica") MagicaDTO magicaDTO) {
        Magica magica = new MagicaBuilder()
                .setId(magicaDTO.getId())
                .setNombre(magicaDTO.getNombre())
                .setEfecto(magicaDTO.getEfecto())
                .setTipoMagica(magicaDTO.getTipoMagica())
                .build();
        magicaService.saveCarta(magicaDTO);
        return "redirect:/magica/new?success";
    }


}
