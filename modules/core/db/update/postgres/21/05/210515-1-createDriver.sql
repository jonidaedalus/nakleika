create table NAKLEIKA_DRIVER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    FULL_NAME varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    CITY varchar(50) not null,
    --
    CAR_ID uuid not null,
    --
    primary key (ID)
);