package com.project.ey.bluepy.onlinePayment.repositories;

import com.project.ey.bluepy.onlinePayment.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<User, UUID> {
}
