package com.project.ey.bluepy.onlinePayment.controller;

import com.project.ey.bluepy.onlinePayment.entities.Company;
import com.project.ey.bluepy.onlinePayment.entities.User;
import com.project.ey.bluepy.onlinePayment.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("company")
    public List<Company> getAllCompanies(){
        List<Company> companies = companyService.getAll();
        return companies;
    }

    @PostMapping(path = "company",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> saveCompany(@RequestBody Company company) throws ServerException {

        Company companySaved = companyService.save(company);

        if (companySaved == null) {
            throw new ServerException("Error de datos");
        } else {
            return new ResponseEntity<>(companySaved, HttpStatus.CREATED);
        }
    }

    @PostMapping(path = "companiesList",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Company>> saveListCompany(@RequestBody List<Company> companies) throws ServerException {

        List<Company> companiesSaved = companyService.saveAll(companies);

        if (companiesSaved == null) {
            throw new ServerException("Error de datos");
        } else {
            return new ResponseEntity<>(companiesSaved, HttpStatus.CREATED);
        }
    }
}
