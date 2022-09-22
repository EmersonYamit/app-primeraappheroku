package com.eyam.ejemploMVC.personaEntitys;

import java.util.ArrayList;
import java.util.List;

public class ListaPersona {

    private List<Persona> personaList;

    public ListaPersona() {
        this.personaList = new ArrayList<>();
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void agregarPersona(Persona persona){
        this.personaList.add(persona);
    }
}
