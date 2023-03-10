package com.tsswebapps.smallfinances.domain.company.service;

import com.tsswebapps.smallfinances.domain.company.entities.Company;
import com.tsswebapps.smallfinances.services.CrudService;

import java.util.List;
import java.util.UUID;

public class CompanyCrudService implements CrudService<Company> {
    @Override
    public Company save(Company model) {
        return null;
    }

    @Override
    public List<Company> listOf() {
        return null;
    }

    @Override
    public Company findById(UUID id) {
        return null;
    }

    @Override
    public void delete(Company entitie) {

    }

    @Override
    public void delete(UUID id) {

    }
}
