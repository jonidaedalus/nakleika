alter table NAKLEIKA_CAR rename column driver_id to driver_id__u41324 ;
alter table NAKLEIKA_CAR alter column driver_id__u41324 drop not null ;
alter table NAKLEIKA_CAR drop constraint FK_NAKLEIKA_CAR_ON_DRIVER ;
drop index IDX_NAKLEIKA_CAR_ON_DRIVER ;
