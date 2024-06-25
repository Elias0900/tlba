package org.tlba.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tlba.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);

}
