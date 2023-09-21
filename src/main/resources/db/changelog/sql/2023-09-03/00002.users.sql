do
$$
begin
create type users_sex as enum('male', 'female');
exception
    when duplicate_object then null;
end $$;

CREATE TABLE users
(
    id            BIGINT generated always as identity NOT NULL,
    name          varchar(100)                        NOT NULL,
    surname       varchar(100)                        NOT NULL,
    sex           users_sex,
    birth_date    DATE                                NOT NULL,
    biography     TEXT NULL,
    city          varchar(100)                        NOT NULL,
    password_hash varchar(100)                        NOT NULL,
    primary key (id)
)
;