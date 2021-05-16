alter table NAKLEIKA_ADVERTISEMENT add column TYPE_ varchar(50) ^
update NAKLEIKA_ADVERTISEMENT set TYPE_ = 'SMALL' where TYPE_ is null ;
alter table NAKLEIKA_ADVERTISEMENT alter column TYPE_ set not null ;
alter table NAKLEIKA_ADVERTISEMENT add column CAR_CLASS varchar(50) ^
update NAKLEIKA_ADVERTISEMENT set CAR_CLASS = 'ECONOM' where CAR_CLASS is null ;
alter table NAKLEIKA_ADVERTISEMENT alter column CAR_CLASS set not null ;
alter table NAKLEIKA_ADVERTISEMENT add column BUDGET decimal(19, 2) ^
update NAKLEIKA_ADVERTISEMENT set BUDGET = 0 where BUDGET is null ;
alter table NAKLEIKA_ADVERTISEMENT alter column BUDGET set not null ;
alter table NAKLEIKA_ADVERTISEMENT add column STICKER_ID uuid ;
