create table Countries
(
  ID INT,
  Country char varying(30) ,
  Mainland char varying(30) ,
  Population int ,
  Capital char varying(30) ,
  TimeZone char varying(30)
);

create table Continent
(
  ID INT,
  Continent char varying(30) NOT NULL PRIMARY KEY,
  Climate char varying(30),
  DefCountries INT
);

create table TimeZone
(
  ID INT,
  TimeZone char varying(30) NOT NULL PRIMARY KEY ,
  Goverment char varying(30) NOT NULL
);

create table Capital
(
  ID INT,
  Capital char varying(30) NOT NULL PRIMARY KEY ,
  Governor char varying(30),
  Population int
);

create table CountriesEmployer
(
  ID INT,
  Countries char varying(30) NOT NULL PRIMARY KEY ,
  Unemployed char varying(30)
);

