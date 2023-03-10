create table tb_companies (
                             id binary(16) not null,
                             name varchar(80) not null,
                             contract_id binary(16),
                             primary key (id)
);
create table tb_contracts (
                              id binary(16) not null,
                              contract_date date,
                              contract_expiration date,
                              situation varchar(255),
                              primary key (id)
);
create table tb_releases (
                             id binary(16) not null,
                             amount decimal(38,2),
                             financial_situation varchar(255),
                             origin varchar(255),
                             release_date date,
                             supplier_id binary(16),
                             user_id binary(16),
                             primary key (id)
);
create table tb_suppliers (
                              id binary(16) not null,
                              name varchar(80) not null,
                              company_id binary(16),
                              primary key (id)
);
create table tb_users (
                          id binary(16) not null,
                          email varchar(100) not null,
                          name varchar(80) not null,
                          password varchar(255) not null,
                          situation varchar(255),
                          company_id binary(16),
                          primary key (id)
);
alter table tb_companys
    add constraint FKaacrrqfp8hxw0fual89lsmaog
        foreign key (contract_id)
            references tb_contracts (id);
alter table tb_releases
    add constraint FKeltrqfi3lxlplb4vi7pe40qtj
        foreign key (supplier_id)
            references tb_suppliers (id);
alter table tb_releases
    add constraint FKpsfpheh7g2dy9rektnrqvoevw
        foreign key (user_id)
            references tb_users (id);
alter table tb_suppliers
    add constraint FK2flvxiujpurh3954sxrxena2r
        foreign key (company_id)
            references tb_companys (id);
alter table tb_users
    add constraint FKk30d3jxwil0g999j8nbq65q97
        foreign key (company_id)
            references tb_companys (id);