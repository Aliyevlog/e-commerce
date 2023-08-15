create table e_commerce_ms.user_address
(
    id            int primary key,
    user_id       int,
    address_line1 varchar(30) not null,
    address_line2 varchar(30),
    city          varchar(15),
    postal_code   varchar(10),
    country       varchar(15),
    telephone     varchar(15),
    mobile        varchar(15) not null


)