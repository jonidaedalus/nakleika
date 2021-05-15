alter table NAKLEIKA_CAR add constraint FK_NAKLEIKA_CAR_ON_COLOR foreign key (COLOR_ID) references NAKLEIKA_D_CAR_COLOR(ID);
create index IDX_NAKLEIKA_CAR_ON_COLOR on NAKLEIKA_CAR (COLOR_ID);
