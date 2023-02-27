package com.project.ey.bluepy.onlinePayment.repositories;

import com.project.ey.bluepy.onlinePayment.entities.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends MongoRepository<Account, UUID> {
    Account findAccountByAccountNumber(Long accountNumber);
}
