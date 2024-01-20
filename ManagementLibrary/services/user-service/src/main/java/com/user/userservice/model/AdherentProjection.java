package com.user.userservice.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Adherent.class, name="p2-adh")
public interface AdherentProjection {
    public Long getId();
    public Role getRole();
    public String getEcole();
}
