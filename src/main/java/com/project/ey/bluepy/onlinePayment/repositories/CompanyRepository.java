package com.project.ey.bluepy.onlinePayment.repositories;

import com.project.ey.bluepy.onlinePayment.entities.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyRepository extends MongoRepository<Company, UUID> {
    Company findCompanyByCompanyNumber(Long companyNumber);
}
