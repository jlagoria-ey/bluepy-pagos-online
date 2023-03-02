package com.project.ey.bluepy.onlinePayment.repositories;

import com.project.ey.bluepy.onlinePayment.entities.OnlinePayment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OnlinePaymentRepository extends MongoRepository<OnlinePayment, UUID> {

}
