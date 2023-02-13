package com.project.ey.bluepy.onlinePayment.entities;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class UuidIdentifiedEntity {

    @Id
    protected UUID id;

    public UuidIdentifiedEntity() {
    }

    public void setId(UUID id) {

        if (this.id != null) {
            throw new UnsupportedOperationException("ID is already defined");
        }

        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
