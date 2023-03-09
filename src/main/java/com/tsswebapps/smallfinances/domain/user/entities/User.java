package com.tsswebapps.smallfinances.domain.user.entities;


import com.tsswebapps.smallfinances.domain.company.entities.Company;
import com.tsswebapps.smallfinances.domain.enumerations.Situation;

public class User {
    private Long id;
    private String name;

    private String email;

    private String password;
    private Situation situation;

    private Company company;

}
