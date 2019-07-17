create schema spotify_db;

use spotify_db;

create table artists (
id bigint(20) not null auto_increment,
name varchar(30) not null,
genre varchar(20),
email varchar(20),
country varchar(30),
primary key (id));

select * from artists;

create table album (
id bigint(20) not null auto_increment,
name varchar(30) not null,
year int(4) not null,
cover_image_url varchar(100),
artist_id bigint(20) not null,
primary key (id),
foreign key (artist_id) references artists(id));

create table songs (
id bigint(20) not null auto_increment,
title varchar(30) not null,
duration int(4) not null,
album_id bigint(20) not null,
primary key (id),
foreign key (album_id) references album(id));
