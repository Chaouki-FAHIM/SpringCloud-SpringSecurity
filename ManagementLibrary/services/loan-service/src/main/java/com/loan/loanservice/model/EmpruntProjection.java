package com.loan.loanservice.model;


import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Emprunt.class, name="p3")
public interface EmpruntProjection {
    public String getId();
    public List<Emprunt> getBooks();
    public EtatEmprunt getEtat();
    public Long getAdherent();
}
