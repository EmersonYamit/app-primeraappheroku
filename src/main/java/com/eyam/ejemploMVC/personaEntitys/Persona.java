package com.eyam.ejemploMVC.personaEntitys;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

//import java.util.LongSummaryStatistics;
@Data
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="email")
    private String email;
    @Column(name="telefono")
    private String telefono;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
}
