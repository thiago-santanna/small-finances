package com.tsswebapps.smallfinances.domain.releases.entities;

import com.tsswebapps.smallfinances.domain.enumerations.FinancialSituation;
import com.tsswebapps.smallfinances.domain.enumerations.Origin;
import com.tsswebapps.smallfinances.domain.supplier.entities.Supplier;
import com.tsswebapps.smallfinances.domain.user.entities.User;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Release {
    private Long id;
    private Origin origin;
    private User user;
    private BigDecimal amount;
    private LocalDate releaseDate;
    private FinancialSituation financialSituation;
    private Supplier supplier;
}
