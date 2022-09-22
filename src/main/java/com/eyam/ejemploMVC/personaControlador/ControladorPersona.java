package com.eyam.ejemploMVC.personaControlador;

import com.eyam.ejemploMVC.personaEntitys.ListaPersona;
import com.eyam.ejemploMVC.personaEntitys.Persona;
import com.eyam.ejemploMVC.personaServices.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class ControladorPersona {

    private PersonaService service;

    public ControladorPersona(PersonaService service) {
        this.service= service;
    }

    /*@GetMapping(path = "/lista")
    public List<Persona> listaPersonas(){
        return this.service.getLstPersonas();
    }*/
    @PostMapping("/personal")
    public RedirectView crearPersona(@ModelAttribute Persona persona, Model model){
        model.addAttribute(persona);
        this.service.crearPersona(persona);
        return new RedirectView("/personal");
    }
    @GetMapping("/personal/eliminar/{id}")
    public RedirectView borrarPersona(@PathVariable("id") long id){
        this.service.borrarPersona(id);
        return new RedirectView("/personal");

    }
}
