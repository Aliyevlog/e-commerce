create table e_commerce_ms.cart_item
(
    id          int primary key,
    session_id  int,
    product_id  int,
    quantity    int,
    create_at   timestamp,
    modified_at timestamp

)