package com.tsswebapps.smallfinances.domain.user.service;

import com.tsswebapps.smallfinances.domain.user.entities.User;
import com.tsswebapps.smallfinances.services.CrudService;

import java.util.List;
import java.util.UUID;

public class UserCrudService implements CrudService<User> {
    @Override
    public User save(User model) {
        return null;
    }

    @Override
    public List<User> listOf() {
        return null;
    }

    @Override
    public User findById(UUID id) {
        return null;
    }

    @Override
    public void delete(User entitie) {

    }

    @Override
    public void delete(UUID id) {

    }
}
