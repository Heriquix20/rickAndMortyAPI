package br.com.hcgv.rickandmortyapi.repository;

import br.com.hcgv.rickandmortyapi.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryLocation extends JpaRepository<Location, Long> {
    boolean existsByName(String name);
}
