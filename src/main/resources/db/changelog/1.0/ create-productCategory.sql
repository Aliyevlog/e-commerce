create table e_commerce_ms.product_category
(
    id          int primary key,
    name        varchar(15) not null,
    description varchar(80),
    created_at  timestamp,
    modified_at timestamp,
    deleted_at  timestamp
)



