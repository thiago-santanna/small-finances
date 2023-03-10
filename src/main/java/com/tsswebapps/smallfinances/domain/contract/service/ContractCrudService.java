package com.tsswebapps.smallfinances.domain.contract.service;

import com.tsswebapps.smallfinances.domain.contract.entities.Contract;
import com.tsswebapps.smallfinances.services.CrudService;

import java.util.List;
import java.util.UUID;

public class ContractCrudService implements CrudService<Contract> {
    @Override
    public Contract save(Contract model) {
        return null;
    }

    @Override
    public List<Contract> listOf() {
        return null;
    }

    @Override
    public Contract findById(UUID id) {
        return null;
    }

    @Override
    public void delete(Contract entitie) {

    }

    @Override
    public void delete(UUID id) {

    }
}
