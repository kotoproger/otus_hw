CREATE TABLE users
(
    id            BIGINT UNSIGNED auto_increment NOT NULL,
    name          varchar(100) NOT NULL,
    surname       varchar(100) NOT NULL,
    sex           ENUM('male', 'female') NULL,
    birth_date    DATE         NOT NULL,
    biography     TEXT NULL,
    city          varchar(100) NOT NULL,
    password_hash varchar(100) NOT NULL,
    primary key (id)
) ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_swedish_ci;