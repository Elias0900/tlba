package org.tlba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlba.DTO.JoueurDTO;
import org.tlba.Repo.JoueurRepo;
import org.tlba.Repo.TeamRepository;
import org.tlba.entities.Joueur;
import org.tlba.entities.Team;

import java.util.List;


public interface JoueurService {


    List<JoueurDTO> getAll();

    JoueurDTO saveOrUpdate(JoueurDTO j) throws Exception;

    JoueurDTO update(JoueurDTO j) throws Exception;

    JoueurDTO findById(long id) throws Exception;

    JoueurDTO findByNom(String nom) throws Exception;

    void suppressionJoueur(long id);

    List<JoueurDTO> getByTeamId(long id);




}
