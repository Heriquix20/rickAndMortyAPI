package br.com.hcgv.rickandmortyapi.repository;

import br.com.hcgv.rickandmortyapi.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCharacter extends JpaRepository<Character, Long>  {

    boolean existsByName(String name);
}
