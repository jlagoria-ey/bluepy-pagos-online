package com.project.ey.bluepy.onlinePayment.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.UUID;

@Document("persona")
public class User extends UuidIdentifiedEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String lastName;

    private Long personaNumber;

    private Boolean activa;

    public User() {
    }

    public User(String name, String lastName, Long personaNumber, Boolean activa) {
        this.name = name;
        this.lastName = lastName;
        this.personaNumber = personaNumber;
        this.activa = activa;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPersonaNumber() {
        return personaNumber;
    }

    public void setPersonaNumber(Long personaNumber) {
        this.personaNumber = personaNumber;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }
}
