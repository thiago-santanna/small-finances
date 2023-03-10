package com.tsswebapps.smallfinances.domain.supplier;

import com.tsswebapps.smallfinances.domain.supplier.entities.Supplier;
import com.tsswebapps.smallfinances.services.CrudService;

import java.util.List;
import java.util.UUID;

public class SupplierCrudService implements CrudService<Supplier> {
    @Override
    public Supplier save(Supplier model) {
        return null;
    }

    @Override
    public List<Supplier> listOf() {
        return null;
    }

    @Override
    public Supplier findById(UUID id) {
        return null;
    }

    @Override
    public void delete(Supplier entitie) {

    }

    @Override
    public void delete(UUID id) {

    }
}
