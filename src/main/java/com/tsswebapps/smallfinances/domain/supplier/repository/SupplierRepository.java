package com.tsswebapps.smallfinances.domain.supplier.repository;

import com.tsswebapps.smallfinances.domain.supplier.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupplierRepository extends JpaRepository<Supplier, UUID> {
}
