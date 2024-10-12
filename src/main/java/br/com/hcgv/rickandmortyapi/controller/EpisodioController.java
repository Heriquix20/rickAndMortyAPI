package br.com.hcgv.rickandmortyapi.controller;


import br.com.hcgv.rickandmortyapi.services.ServicoGeral;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/episodios")
public class EpisodioController {

    private ServicoGeral service;

    public EpisodioController(ServicoGeral service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity listarLocais() {
        return ResponseEntity.ok().body(service.listarEpisodios());
    }
















}
