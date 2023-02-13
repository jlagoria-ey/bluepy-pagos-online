package com.project.ey.bluepy.onlinePayment.repositories.impl;

import com.project.ey.bluepy.onlinePayment.entities.UuidIdentifiedEntity;
import com.project.ey.bluepy.onlinePayment.repositories.CustomMongoRepository;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.util.UUID;

public class CustomMongoRepositoryImpl<T extends UuidIdentifiedEntity>
        extends SimpleMongoRepository<T, UUID> implements CustomMongoRepository<T> {

    public CustomMongoRepositoryImpl(MongoEntityInformation<T, UUID> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
    }

    @Override
    public <S extends T> S save(S entity) {
        generateId(entity);
        return super.save(entity);
    }

    @Override
    public <S extends T> S insert(S entity) {
        generateId(entity);
        return super.insert(entity);
    }


    protected <S extends T> void generateId(S entity) {
        entity.setId(UUID.randomUUID());
    }
}