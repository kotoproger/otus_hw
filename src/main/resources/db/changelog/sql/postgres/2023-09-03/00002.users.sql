CREATE TABLE users
(
    id            BIGINT generated always as identity NOT NULL,
    name          varchar(100)                        NOT NULL,
    surname       varchar(100)                        NOT NULL,
    sex           varchar(10),
    birth_date    DATE                                NOT NULL,
    biography     TEXT NULL,
    city          varchar(100)                        NOT NULL,
    password_hash varchar(100)                        NOT NULL,
    primary key (id)
)
;