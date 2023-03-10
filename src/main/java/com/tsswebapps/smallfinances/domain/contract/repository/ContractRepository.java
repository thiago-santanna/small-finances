package com.tsswebapps.smallfinances.domain.contract.repository;

import com.tsswebapps.smallfinances.domain.contract.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContractRepository extends JpaRepository<Contract, UUID> {
}
