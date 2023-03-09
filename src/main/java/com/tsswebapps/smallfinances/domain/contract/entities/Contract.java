package com.tsswebapps.smallfinances.domain.contract.entities;

import com.tsswebapps.smallfinances.domain.company.entities.Company;
import com.tsswebapps.smallfinances.domain.enumerations.Situation;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_contracts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public class Contract {
    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Situation situation;

    @OneToOne(fetch = FetchType.EAGER)
    private Company company;


    private LocalDate contractDate;

    private LocalDate contractExpiration;
}
