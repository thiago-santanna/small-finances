package com.tsswebapps.smallfinances.domain.supplier.entities;

import com.tsswebapps.smallfinances.domain.company.entities.Company;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "tb_suppliers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public class Supplier {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(length = 80, nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    private Company company;
}
