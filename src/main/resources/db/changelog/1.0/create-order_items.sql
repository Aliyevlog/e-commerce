create table e_commerce_ms.order_items
(
    id          int primary key,
    order_id    int,
    product_id  int,
    quantity    int,
    created_at  timestamp,
    modified_at timestamp
)