create table e_commerce_ms.discount
(

    id               int primary key,
    name             varchar(15) not null,
    description      varchar(50),
    discount_percent decimal,
    active           boolean,
    created_at       timestamp,
    modified_at      timestamp,
    deleted_at       timestamp

)