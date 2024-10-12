package br.com.hcgv.rickandmortyapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Origem(String name, String url) {
}
