package com.tsswebapps.smallfinances.services;

import java.util.List;
import java.util.UUID;

public interface CrudService<T> {
    T  save(T model);
    List<T> listOf();
    T findById(UUID id);
    void delete(T entitie);
    void delete(UUID id);
}
