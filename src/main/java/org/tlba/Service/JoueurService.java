package org.tlba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlba.Repo.JoueurRepo;
import org.tlba.Repo.TeamRepository;
import org.tlba.entities.Joueur;
import org.tlba.entities.Team;

import java.util.List;

@Service
public class JoueurService {

    @Autowired
    private JoueurRepo joueurRepo;

    public List<Joueur> getAllJoueurs() {
        return joueurRepo.findAll();
    }

    public Joueur saveJoueur(Joueur joueur) {
        return joueurRepo.save(joueur);
    }


}
