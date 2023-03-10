package com.tsswebapps.smallfinances.domain.releases.service;

import com.tsswebapps.smallfinances.domain.releases.entities.Release;
import com.tsswebapps.smallfinances.services.CrudService;

import java.util.List;
import java.util.UUID;

public class ReleaseCrudService implements CrudService<Release> {
    @Override
    public Release save(Release model) {
        return null;
    }

    @Override
    public List<Release> listOf() {
        return null;
    }

    @Override
    public Release findById(UUID id) {
        return null;
    }

    @Override
    public void delete(Release entitie) {

    }

    @Override
    public void delete(UUID id) {

    }
}
