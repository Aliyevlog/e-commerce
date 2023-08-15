create table e_commerce_ms.product_inventory
(

    id          int primary key,
    quantity    int,
    created_at  timestamp,
    modified_at timestamp,
    deleted_at  timestamp
)