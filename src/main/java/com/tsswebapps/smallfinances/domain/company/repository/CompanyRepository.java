package com.tsswebapps.smallfinances.domain.company.repository;

import com.tsswebapps.smallfinances.domain.company.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {
}
