package br.com.hcgv.rickandmortyapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record ResultsCharacter(@JsonAlias("results") List<Character> personagens) {
}
