create table e_commerce_ms.product
(
    id           int primary key,
    name         varchar(15) not null,
    description  varchar(50),
    SKU          varchar(50),
    category_id  int,
    inventory_id int,
    price        decimal,
    discount_id  int,
    created_at   timestamp,
    modified_at  timestamp,
    deleted_at   timestamp

)