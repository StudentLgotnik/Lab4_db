UPDATE SYSTEM.COUNTRIES SET ID = NULL ;
UPDATE SYSTEM.CAPITAL SET ID = NULL ;
UPDATE SYSTEM.CONTINENT SET ID = NULL ;
UPDATE SYSTEM.COUNTRIESEMPLOYER SET ID = NULL ;
UPDATE SYSTEM.TIMEZONE SET ID = NULL ;

ALTER TABLE COUNTRIES MODIFY ID Raw(16);
ALTER TABLE CAPITAL MODIFY ID Raw(16);
ALTER TABLE CONTINENT MODIFY ID Raw(16);
ALTER TABLE COUNTRIESEMPLOYER MODIFY ID Raw(16);
ALTER TABLE TIMEZONE MODIFY ID Raw(16);

UPDATE COUNTRIES SET ID = sys_guid();
UPDATE CAPITAL SET ID = sys_guid();
UPDATE CONTINENT SET ID = sys_guid();
UPDATE COUNTRIESEMPLOYER SET ID = sys_guid();
UPDATE TIMEZONE SET ID = sys_guid();