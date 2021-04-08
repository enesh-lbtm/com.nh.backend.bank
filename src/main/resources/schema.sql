CREATE TABLE users
(
    "id"        bigserial    NOT NULL,
    name        varchar(50)  NOT NULL,
    middle_name varchar(50)  NOT NULL,
    surname     varchar(50)  NOT NULL,
    birthday    varchar(50)  NOT NULL,
    login       varchar(255) NOT NULL,
    password    varchar(255) NOT NULL,
    pin         bigint       NOT NULL,
    role        varchar(50)  NOT NULL DEFAULT 'USER',
    CONSTRAINT PK_users PRIMARY KEY ("id"),
    CONSTRAINT AK1_users UNIQUE (login)
);
create table ids
(
    "id"       bigserial primary key   not null,
    id_private bigint                  references users (id) on delete set null,
    id_public  varchar(512)            not null,
    time       timestamp default now() not null,
    unique (id_private)
);


CREATE TABLE "account"
(
    "id"          bigserial   NOT NULL,
    "users_id"    bigint      NOT NULL,
    "title"       varchar(50) NOT NULL,
    "type"        varchar(50) NOT NULL,
    "to_increase" varchar(50) NOT NULL,
    "description" varchar(50) NOT NULL,
    "debit"       decimal     NOT NULL,
    "credit"      decimal     NOT NULL,
    "balance"     decimal     NOT NULL,
    CONSTRAINT "PK_account" PRIMARY KEY ("id"),
    CONSTRAINT "FK_71" FOREIGN KEY ("users_id") REFERENCES "users" ("id")
);

CREATE TABLE "contract"
(
    "id"         bigserial   NOT NULL,
    "users_id"   bigint      NOT NULL,
    "type"       varchar(50) NOT NULL,
    "constantly" varchar(50) NOT NULL,
    "currency"   varchar(50) NOT NULL,
    "start_date" varchar(50) NOT NULL,
    "end_date"   varchar(50) NOT NULL,
    "amount"     decimal     NOT NULL,
    "interest"   decimal     NOT NULL,
    "notes"      varchar(100),
    CONSTRAINT "PK_contract" PRIMARY KEY ("id"),
    CONSTRAINT "FK_82" FOREIGN KEY ("users_id") REFERENCES "users" ("id")
);

CREATE TABLE "transaction"
(
    "id"         bigserial   NOT NULL,
    "account_id" bigint      NOT NULL,
    "client_id"  bigint      NOT NULL,
    "type"       varchar(50) NOT NULL,
    "tran_date"  varchar(50) NOT NULL,
    "debit"      boolean     NOT NULL,
    "amount"     decimal     NOT NULL,
    CONSTRAINT "PK_transaction" PRIMARY KEY ("id"),
    CONSTRAINT "FK_101" FOREIGN KEY ("account_id") REFERENCES "account" ("id"),
    CONSTRAINT "FK_106" FOREIGN KEY ("client_id") REFERENCES "account" ("id")
);

CREATE TABLE users_img
(
    "id"      bigserial   NOT NULL,
    name      varchar(50) not null,
    extension varchar(50) not null,
    img       oid         not null,
    CONSTRAINT PK_users_img PRIMARY KEY ("id"),
    CONSTRAINT FK_831 FOREIGN KEY ("id") REFERENCES users ("id")
);


CREATE TABLE users_contact
(
    "id"     bigserial   NOT NULL,
    tel_mob  varchar(50) NOT NULL,
    tel_home varchar(50),
    email    varchar(50) NOT NULL,
    CONSTRAINT PK_mobile PRIMARY KEY ("id"),
    CONSTRAINT FK_51 FOREIGN KEY ("id") REFERENCES users ("id")
);

CREATE TABLE users_status
(
    "id"           bigserial   NOT NULL,
    "users_id"     bigint NOT NULL,
    disability     varchar(50) NOT NULL,
    retiree        boolean     NOT NULL,
    monthly_income decimal     NOT NULL,
    CONSTRAINT PK_users_status PRIMARY KEY ("id"),
    CONSTRAINT FK_80 FOREIGN KEY ("users_id") REFERENCES users ("id")
);

CREATE TABLE address
(
    "id"            bigserial   NOT NULL,
    "users_id"   bigint NOT NULL,
    country         varchar(50) NOT NULL,
    town            varchar(50) NOT NULL,
    street          varchar(50) NOT NULL,
    building_number int         NOT NULL,
    "floor"         int         NOT NULL,
    CONSTRAINT PK_address PRIMARY KEY ("id"),
    CONSTRAINT FK_832 FOREIGN KEY ("users_id") REFERENCES users ("id")
);

CREATE TABLE users_document
(
    "id"            bigserial   NOT NULL,
    nationality     varchar(50) NOT NULL,
    birth_place     varchar(50) NOT NULL,
    living_country  varchar(50) NOT NULL,
    type            varchar(50) NOT NULL,
    document_serial varchar(50) NOT NULL,
    document_number varchar(50) NOT NULL,
    issued_by       varchar(50) NOT NULL,
    issue_date      varchar(50) NOT NULL,
    ident_number    varchar(50) NOT NULL,
    family_status   varchar(50) NOT NULL,
    CONSTRAINT PK_ident_document PRIMARY KEY ("id"),
    CONSTRAINT FK_44 FOREIGN KEY ("id") REFERENCES users ("id")
);


CREATE OR REPLACE FUNCTION update_active_ids()
    RETURNS trigger AS
$$
BEGIN
delete
from ids
where time <= now() - INTERVAL '10 minutes';
RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';


CREATE TRIGGER test_trigger
    AFTER INSERT or DELETE or UPDATE
    ON ids
    FOR EACH ROW
EXECUTE PROCEDURE update_active_ids();