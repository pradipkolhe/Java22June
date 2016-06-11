create database StudentDB;

use StudentDB;

create table StudInfo(sid int primary key,name varchar(15),contact varcha
r(10),email varchar(50));

desc studinfo;

insert into StudInfo(sid,name,contact,email) values(1,'Abc','986765785','abc@gmail.com');

select * from StudInfo;

update studinfo set email='abc@yahoo.com'  where sid=1;

delete from studinfo where sid=1;