-- update NAKLEIKA_CAR set CAR_MODEL_ID = <default_value> where CAR_MODEL_ID is null ;
alter table NAKLEIKA_CAR alter column CAR_MODEL_ID set not null ;
