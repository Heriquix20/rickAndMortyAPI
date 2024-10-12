package br.com.hcgv.rickandmortyapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record ResultsEpisode(@JsonAlias("results") List<Episode> episodios) {
}
