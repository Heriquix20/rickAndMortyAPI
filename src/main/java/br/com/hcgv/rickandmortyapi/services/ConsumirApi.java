package br.com.hcgv.rickandmortyapi.services;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class ConsumirApi {

    public String obterJson(String endereco) {
        HttpClient client =  HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            System.out.println("Erro ao tentar consumir a API");
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            System.out.println("Erro ao tentar consumir a API");
            throw new RuntimeException(e);
        }
        return response.body();
    }



}
