create table e_commerce_ms.shopping_session
(
    id          int primary key,
    user_id     int,
    total       decimal,
    created_at  timestamp,
    modified_at timestamp

)