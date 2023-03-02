package com.project.ey.bluepy.onlinePayment.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("empresa")
public class Company extends UuidIdentifiedEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Long companyNumber;

    private Boolean active;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(Long companyNumber) {
        this.companyNumber = companyNumber;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActiva(Boolean active) {
        this.active = active;
    }
}
