package com.example.disney.disney.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personaje")
@Getter
@Setter

public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private Integer edad;
    private Long peso;
    private String historia;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas = new ArrayList<>();

    //Add and remove peliculas
    public void addPeliculas(PeliculaEntity pelicula) {this.peliculas.add(pelicula);}

    public void removePeliculas(PeliculaEntity pelicula) {this.peliculas.remove(pelicula);}

}
