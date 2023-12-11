package com.makkaoui.comptemicroservice.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = BankAccount.class , name = "p1")
public interface AccountProjection {
    public String getid();
    public Double getbalance();
    public Date getdateAt();
}
