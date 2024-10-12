package br.com.hcgv.rickandmortyapi.repository;

import br.com.hcgv.rickandmortyapi.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEpisode extends JpaRepository<Episode, Long> {
    boolean existsByName(String name);
}
