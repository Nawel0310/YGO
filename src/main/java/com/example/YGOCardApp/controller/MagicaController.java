package com.example.YGOCardApp.controller;
import com.example.YGOCardApp.entities.Magica.Magica;
import com.example.YGOCardApp.DTO.MagicaDTO;
import com.example.YGOCardApp.entities.Magica.MagicasBuilder.MagicaBuilder;
import com.example.YGOCardApp.service.MagicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/magicas")
public class MagicaController {

    private final MagicaService magicaService;

    @Autowired
    public MagicaController(MagicaService magicaService) {
        this.magicaService = magicaService;
    }

    @GetMapping("/crear")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("magicaDTO", new MagicaDTO());
        return "crearMagica"; // Nombre de la plantilla Thymeleaf (crearMagica.html)
    }

    @PostMapping("/crear")
    public String crearMagica(@ModelAttribute("magicaDTO") MagicaDTO magicaDTO) {
        Magica magica = new MagicaBuilder()
                .setNombre(magicaDTO.getNombre())
                .setEfecto(magicaDTO.getEfecto())
                .setTipoMagica(magicaDTO.getTipoMagica())
                .build();

        magicaService.saveCarta(magica);
        return "redirect:/magicas"; // Redirigir a la página principal de cartas mágicas
    }

    @GetMapping
    public String listarMagicas(Model model) {
        List<Magica> magicas = magicaService.getAllCartas();
        model.addAttribute("magicas", magicas);
        return "listarMagicas"; // Nombre de la plantilla Thymeleaf (listarMagicas.html)
    }

    @GetMapping("/{id}")
    public String mostrarDetallesMagica(@PathVariable Integer id, Model model) {
        Optional<Magica> optionalMagica = magicaService.getCartaById(id);
        optionalMagica.ifPresent(magica -> model.addAttribute("magica", magica));
        return optionalMagica.isPresent() ? "detallesMagica" : "notFound"; // Detalles o página de no encontrado
    }

    @PostMapping("/{id}/eliminar")
    public String eliminarMagica(@PathVariable Integer id) {
        magicaService.deleteCarta(id);
        return "redirect:/magicas"; // Redirigir a la página principal de cartas mágicas
    }
}

