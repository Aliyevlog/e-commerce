create table e_commerce_ms.user
(
    id          int primary key,
    username    varchar(15) not null,
    password    varchar(8)  not null,
    first_name  varchar(15) not null,
    last_name   varchar(20) not null,
    telephone   int,
    created_at  timestamp,
    modified_at timestamp

)