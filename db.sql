create database if not exists UserPasswordTable;

use UserPasswordTable;

create table users (
	userName varchar (50),
	password varchar (50));

insert into users values('eric', 'test1');
insert into users values('brendon', 'test1');
insert into users values('cassidy', 'test1');
insert into users values('althea', 'test1');
