create table Userdetails(
user_id number(20) PRIMARY KEY ,
password varchar(30) not null,
user_name varchar(20),
email varchar(20) not null unique,
phone_number number(10),
address varchar(50)
)

--------------------
create table cropdetails(
crop_name varchar(30) not null,
crop_id NUMBER(10) primary key,
description varchar(255) not null,
duration number(10)
)

--------------------------------
create table fertilizer(
fer_id number(20) primary key,
fer_name varchar(20) not null,
state varchar(20) not null,
cost number(10) not null,
)
------------------------------------------
create table disease(
disease_id number(20) primary key,
disease_name varchar(255) not null,
reason varchar(255),
medicine varchar(255) not null,
prevention varchar(255)
)
---------------------------------------------
create table cropfertilizerdetails(
crop_id number(10) not null,
fer_id number(10) not null,
quantity varchar(255),
stage_of_use varchar(255) not null,
primary key(crop_id,fer_id),
foreign key(crop_id)references cropdetails(crop_id),
foreign key(fer_id) references fertilizer(fer_id)
)
--------------------------------------------
create table cropdiseasedetails(
crop_id number(10) not null,
disease_id number(10)  not null,
affecting_stages varchar(255 ) not null,
primary key(crop_id,disease_id),
foreign key(crop_id)references cropdetails(crop_id),
foreign key(disease_id) references disease(disease_id)
)