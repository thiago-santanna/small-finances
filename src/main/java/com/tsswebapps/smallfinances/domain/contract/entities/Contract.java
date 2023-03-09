package com.tsswebapps.smallfinances.domain.contract.entities;

import com.tsswebapps.smallfinances.domain.company.entities.Company;
import com.tsswebapps.smallfinances.domain.enumerations.Situation;

import java.time.LocalDate;

public class Contract {
    private Long id;

    private Situation situation;
    private Company company;

    private LocalDate contractDate;

    private LocalDate contractExpiration;
}
