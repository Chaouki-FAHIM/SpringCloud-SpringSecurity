package com.user.userservice.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Bibliothecaire.class, name="p2-bib")
public interface BibliothecaireProjection {
    public Long getId();
    public Role getRole();
    public String getEmplacement();
}
