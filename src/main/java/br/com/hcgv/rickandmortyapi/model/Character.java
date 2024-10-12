package br.com.hcgv.rickandmortyapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)

@Getter

@Entity
@Table(name = "personagens")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String status;
    private String species;
    private String gender;
    private String image;

    public Character() {
    }

    public Character(String name, String image, String gender, String species, String status) {
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.species = species;
        this.status = status;
    }


    @Override
    public String toString() {
        return "\n Nome: " + name +
                "\n Status: " + status +
                "\n Espécie: " + species +
                "\n Gênero: " + gender +
                "\n Imagem do personagem: " + image;
    }
}



