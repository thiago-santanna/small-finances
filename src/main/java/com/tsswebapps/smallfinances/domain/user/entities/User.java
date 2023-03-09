package com.tsswebapps.smallfinances.domain.user.entities;


import com.tsswebapps.smallfinances.domain.company.entities.Company;
import com.tsswebapps.smallfinances.domain.enumerations.Situation;
import com.tsswebapps.smallfinances.domain.releases.entities.Release;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public class User {

    @Id
    @GeneratedValue
    private UUID id;
    @Column(length = 80, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    private Situation situation;

    @OneToOne
    private Company company;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Release> releases = new ArrayList<>();

}
