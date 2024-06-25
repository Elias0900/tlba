package org.tlba.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tlba.entities.Joueur;

import java.util.List;

@Repository
public interface JoueurRepo extends JpaRepository<Joueur, Long> {

    Joueur findByNom(String nom);


    List<Joueur> findByEquipesId(long id);
}
