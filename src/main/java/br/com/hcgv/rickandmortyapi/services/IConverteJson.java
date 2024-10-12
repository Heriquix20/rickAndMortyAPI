package br.com.hcgv.rickandmortyapi.services;

public interface IConverteJson {

    <T> T obterDados(String json, Class<T> classe);
}
