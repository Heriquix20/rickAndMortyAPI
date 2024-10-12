package br.com.hcgv.rickandmortyapi.controller;


import br.com.hcgv.rickandmortyapi.services.ServicoGeral;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RequestMapping("/personagens")
@RestController
public class PersonagemController {

    private ServicoGeral service;

    public PersonagemController(ServicoGeral service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity listarPersonagens() {
        return ResponseEntity.ok().body(service.listarPersonagens());
    }


















}
