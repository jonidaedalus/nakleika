-- alter table NAKLEIKA_ADVERTISER add column IMAGE_ID uuid ^
-- update NAKLEIKA_ADVERTISER set IMAGE_ID = <default_value> ;
-- alter table NAKLEIKA_ADVERTISER alter column IMAGE_ID set not null ;
alter table NAKLEIKA_ADVERTISER add column IMAGE_ID uuid not null ;
