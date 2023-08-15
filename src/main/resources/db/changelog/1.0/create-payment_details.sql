create table e_commerce_ms.payment_details
(
    id          int primary key,
    order_id    int,
    amount      int,
    provider    varchar(20),
    status      varchar(20),
    create_at   timestamp,
    modified_at timestamp

)