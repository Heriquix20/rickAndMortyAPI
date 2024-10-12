package br.com.hcgv.rickandmortyapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)

@Getter

@Entity
@Table(name = "locais")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;
    private String type;
    private String dimension;

    public Location() {
    }

    public Location(String name, String dimension, String type) {
        this.name = name;
        this.dimension = dimension;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\n Nome: " + name +
                "\n Tipo: " + type +
                "\n Dimensão: " + dimension;
    }
}
