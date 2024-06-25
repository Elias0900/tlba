package org.tlba.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tlba.entities.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
