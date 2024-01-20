package com.user.userservice.repository;


import com.user.userservice.model.Adherent;
import com.user.userservice.model.Role;
import com.user.userservice.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface AdherentRepository extends JpaRepository<Adherent,Long> {
    @RestResource(path = "/byRole")
    List<Adherent> findByRole(@Param("r") Role role);
}
