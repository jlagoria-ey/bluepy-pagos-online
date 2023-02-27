package com.project.ey.bluepy.onlinePayment.services.impl;

import com.project.ey.bluepy.onlinePayment.entities.Company;
import com.project.ey.bluepy.onlinePayment.repositories.CompanyRepository;
import com.project.ey.bluepy.onlinePayment.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company getCompanyByNumber(Long companyNumber) {
        return companyRepository.findCompanyByCompanyNumber(companyNumber);
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }
}
