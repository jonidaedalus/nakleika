alter table NAKLEIKA_ADVERTISER add constraint FK_NAKLEIKA_ADVERTISER_ON_IMAGE foreign key (IMAGE_ID) references SYS_FILE(ID);
create index IDX_NAKLEIKA_ADVERTISER_ON_IMAGE on NAKLEIKA_ADVERTISER (IMAGE_ID);