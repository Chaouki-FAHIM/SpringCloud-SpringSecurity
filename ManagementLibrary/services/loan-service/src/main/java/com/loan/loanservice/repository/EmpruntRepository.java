package com.loan.loanservice.repository;

import com.loan.loanservice.model.Emprunt;
import com.loan.loanservice.model.EtatEmprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface EmpruntRepository extends JpaRepository<Emprunt,Long> {
    @RestResource(path = "/byEtat")
    List<Emprunt> findByEtat(@Param("e") EtatEmprunt etatEmprunt);

}
