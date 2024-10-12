package br.com.hcgv.rickandmortyapi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)

@Getter

@Entity
@Table(name = "episodios")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;
    private String air_date;
    private String episode;

    public Episode() {
    }

    public Episode(String name, String air_date, String episode) {
        this.name = name;
        this.air_date = air_date;
        this.episode = episode;
    }

    @Override
    public String toString() {
        return "\n Nome: " + name +
                "\n  Data de Lançamento: " + air_date +
                "\n  Temporada: " + episode.split("E")[0].replace("S", "") +
                "\n  Episódio: " + episode.split("E")[1];
    }
}
