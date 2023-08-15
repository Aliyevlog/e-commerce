create table e_commerce_ms.user_payment
(
    id           int primary key ,
    user_id      int,
    payment_type varchar,
    provide      varchar,
    account_no   int,
    expiry       date
)