package br.com.hcgv.rickandmortyapi.services;

import br.com.hcgv.rickandmortyapi.model.*;
import br.com.hcgv.rickandmortyapi.model.Character;
import br.com.hcgv.rickandmortyapi.repository.RepositoryCharacter;
import br.com.hcgv.rickandmortyapi.repository.RepositoryEpisode;
import br.com.hcgv.rickandmortyapi.repository.RepositoryLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicoGeral {

    @Autowired
    private RepositoryCharacter repPersonagem;
    @Autowired
    private RepositoryLocation repLocal;
    @Autowired
    private RepositoryEpisode repEpisodio;

    private ConsumirApi consumir = new ConsumirApi();
    private ConverterJson converter = new ConverterJson();


    public List<Character> listarPersonagens() {
        var json = consumir.obterJson("https://rickandmortyapi.com/api/character");
        var listaPersonagens = converter.obterDados(json, ResultsCharacter.class);
        List<Character> listaP = listaPersonagens.personagens().stream()
                .map(p-> new Character(p.getName(),p.getImage(),p.getGender(),p.getSpecies(),p.getStatus()))
                .collect(Collectors.toList());
        for (Character c : listaP) {
            if (!repPersonagem.existsByName(c.getName())) {
                repPersonagem.save(c);
            }
        }
        List<Character> list = repPersonagem.findAll();
        return list;
    }

    public List<Location> listarLocais() {
        var json = consumir.obterJson("https://rickandmortyapi.com/api/location");
        var listaLocais = converter.obterDados(json, ResultsLocation.class);
        List<Location> listaL = listaLocais.locais().stream()
                .map(l -> new Location(l.getName(), l.getDimension(), l.getType()))
                .collect(Collectors.toList());
        for (Location l : listaL) {
            if (!repLocal.existsByName(l.getName())) {
                repLocal.save(l);
            }
        }
        List<Location> list = repLocal.findAll();
        return list;
    }


    public List<Episode> listarEpisodios() {
        var json = consumir.obterJson("https://rickandmortyapi.com/api/episode");
        var listaEpisodios = converter.obterDados(json, ResultsEpisode.class);
        List<Episode> listaE = listaEpisodios.episodios().stream()
                .map(e -> new Episode(e.getName(), e.getAir_date(), e.getEpisode()))
                .collect(Collectors.toList());
        for (Episode e : listaE) {
            if (!repEpisodio.existsByName(e.getName())) {
                repEpisodio.save(e);
            }
        }
        List<Episode> list = repEpisodio.findAll();
        return list;
    }
}
