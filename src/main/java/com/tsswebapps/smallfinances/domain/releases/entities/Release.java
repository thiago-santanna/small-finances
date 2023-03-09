package com.tsswebapps.smallfinances.domain.releases.entities;

import com.tsswebapps.smallfinances.domain.enumerations.FinancialSituation;
import com.tsswebapps.smallfinances.domain.enumerations.Origin;
import com.tsswebapps.smallfinances.domain.supplier.entities.Supplier;
import com.tsswebapps.smallfinances.domain.user.entities.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_releases")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public class Release {
    @Id
    @GeneratedValue
    private UUID id;
    @Enumerated(EnumType.STRING)
    private Origin origin;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;
    private BigDecimal amount;
    private LocalDate releaseDate;
    @Enumerated(EnumType.STRING)
    private FinancialSituation financialSituation;
    @OneToOne
    private Supplier supplier;
}
