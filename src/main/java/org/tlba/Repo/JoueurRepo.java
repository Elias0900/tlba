package org.tlba.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tlba.entities.Joueur;

@Repository
public interface JoueurRepo extends JpaRepository<Joueur, Long> {
}
