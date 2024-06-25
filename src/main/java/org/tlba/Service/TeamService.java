package org.tlba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlba.DTO.TeamDTO;
import org.tlba.Repo.TeamRepository;
import org.tlba.entities.Team;

import java.util.List;


public interface TeamService {
     List<TeamDTO> getAll();

    TeamDTO saveOrUpdate(TeamDTO t) throws Exception;

    TeamDTO update(TeamDTO t) throws Exception;

    TeamDTO findById(long id) throws Exception;

    TeamDTO findByName(String nom) throws Exception;

    void suppressionTeam(long id);

}
