-- begin NAKLEIKA_D_CAR_COLOR
create table NAKLEIKA_D_CAR_COLOR (
    ID uuid,
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end NAKLEIKA_D_CAR_COLOR
-- begin NAKLEIKA_D_CAR_MODEL
create table NAKLEIKA_D_CAR_MODEL (
    ID uuid,
    --
    BRAND varchar(50) not null,
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end NAKLEIKA_D_CAR_MODEL
-- begin NAKLEIKA_STICKER
create table NAKLEIKA_STICKER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end NAKLEIKA_STICKER
-- begin NAKLEIKA_ROUTE
create table NAKLEIKA_ROUTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end NAKLEIKA_ROUTE
-- begin NAKLEIKA_CAR
create table NAKLEIKA_CAR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PLATE_NUMBER varchar(255) not null,
    COLOR_ID uuid not null,
    CAR_MODEL_ID uuid not null,
    CAR_CLASS varchar(50),
    RELEASE_YEAR integer not null,
    IMAGE_FILE_ID uuid,
    --
    primary key (ID)
)^
-- end NAKLEIKA_CAR
-- begin NAKLEIKA_CONTRACT
create table NAKLEIKA_CONTRACT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end NAKLEIKA_CONTRACT

-- begin NAKLEIKA_ADVERTISEMENT
create table NAKLEIKA_ADVERTISEMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADVERTISER_ID uuid,
    TYPE_ varchar(50) not null,
    STICKER_ID uuid,
    BUDGET decimal(19, 2) not null,
    CAR_CLASS varchar(50) not null,
    --
    primary key (ID)
)^
-- end NAKLEIKA_ADVERTISEMENT
-- begin NAKLEIKA_DRIVER
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
)^
-- end NAKLEIKA_DRIVER
-- begin NAKLEIKA_ADVERTISER
create table NAKLEIKA_ADVERTISER (
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
    IMAGE_ID uuid not null,
    --
    primary key (ID)
)^
-- end NAKLEIKA_ADVERTISER
-- begin NAKLEIKA_EMPLOYEE
create table NAKLEIKA_EMPLOYEE (
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
    primary key (ID)
)^
-- end NAKLEIKA_EMPLOYEE
