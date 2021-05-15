-- alter table NAKLEIKA_CAR add column COLOR_ID uuid ^
-- update NAKLEIKA_CAR set COLOR_ID = <default_value> ;
-- alter table NAKLEIKA_CAR alter column COLOR_ID set not null ;
alter table NAKLEIKA_CAR add column COLOR_ID uuid not null ;
