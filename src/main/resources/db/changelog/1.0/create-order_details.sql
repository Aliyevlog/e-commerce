create table e_commerce_ms.order_details
(
    id          int primary key,
    user_id     int,
    total       decimal,
    payment_id  int,
    created_id  timestamp,
    modified_at timestamp
)