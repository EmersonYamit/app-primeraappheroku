package com.eyam.ejemploMVC.personaServices;

import com.eyam.ejemploMVC.personaEntitys.Persona;
import com.eyam.ejemploMVC.personaEntitys.ListaPersona;
import com.eyam.ejemploMVC.personaRepository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private PersonaRepository repository;
    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }
    public List<Persona> getLstPersonas() {
        return this.repository.findAll();
    }

    public Persona crearPersona(Persona unaPersona){
        return this.repository.save(unaPersona);
    }
    public Boolean borrarPersona(long id){
        this.repository.deleteById(id);
        return true;
    }
}
