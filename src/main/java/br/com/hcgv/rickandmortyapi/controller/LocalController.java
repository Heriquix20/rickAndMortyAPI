package br.com.hcgv.rickandmortyapi.controller;


import br.com.hcgv.rickandmortyapi.services.ServicoGeral;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/locais")
public class LocalController {

    private ServicoGeral service;

    public LocalController(ServicoGeral service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity listarLocais() {
        return ResponseEntity.ok().body(service.listarLocais());
    }












}
