package com.project.ey.bluepy.onlinePayment.services;

import com.project.ey.bluepy.onlinePayment.entities.Company;

import java.util.List;

public interface CompanyService {
    Company save(Company company);
    Company getCompanyByNumber(Long companyNumber);
    List<Company> getAll();
}
