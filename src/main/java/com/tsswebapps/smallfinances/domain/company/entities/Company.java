package com.tsswebapps.smallfinances.domain.company.entities;

import com.tsswebapps.smallfinances.domain.contract.entities.Contract;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "tb_companys")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public class Company {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(length = 80, nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    private Contract contract;
}
