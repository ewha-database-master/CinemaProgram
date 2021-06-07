create table db2021_nation (
                               id int not null,
                               nation varchar(20) not null,
                               lang varchar(10),
                               primary key (id)
);

create index index_nation on db2021_nation(id);

create table db2021_movie(
                             id int not null,
                             title varchar(30) not null,
                             eng_title varchar(50),
                             director varchar(30),
                             released_year int not null,
                             movie_type enum('독립', '상업') not null,
                             genre varchar(20) not null,
                             nation_id int,
                             now_showing boolean,
                             likeCnt int default 0,
                             discount_start date,
                             discount_end date,
                             primary key (id),
                             foreign key (nation_id) references db2021_nation(id)
);

create index index_movie on db2021_movie(id);

create view db2021_movie_view(id, title, eng_title, director, released_year, movie_type, genre, nation_id)
as (select id, title, eng_title, director, released_year, movie_type, genre, nation_id from db2021_movie);


create table db2021_film_festival (
                                      name varchar(20) not null,
                                      festival_year int,
                                      nation_id int,
                                      primary key (name, festival_year),
                                      foreign key (nation_id) references db2021_nation(id)
);

create index index_film_festival on db2021_film_festival(name, festival_year);

create table db2021_result (
                               movie_id int not null,
                               film_festival_name varchar(20) not null,
                               film_festival_year int not null,
                               awards varchar(30),
                               primary key (movie_id, film_festival_name, film_festival_year, awards),
                               foreign key (film_festival_name, film_festival_year) references db2021_film_festival(name, festival_year),
                               foreign key (movie_id) references db2021_movie(id)
);

create index index_result on db2021_result(movie_id, film_festival_name, film_festival_year, awards);

create table db2021_user (
                             nickname varchar(20) not null,
                             primary key (nickname)
);

create table db2021_star (
                             id int not null auto_increment,
                             movie_id int not null,
                             star int not null,
                             review varchar(50) not null,
                             user_nickname varchar(20) not null,
                             primary key (id),
                             foreign key (movie_id) references db2021_movie(id),
                             foreign key (user_nickname) references db2021_user(nickname)
);

create table db2021_like (
                             id int not null auto_increment,
                             user_nickname varchar(20) not null,
                             movie_id int not null,
                             primary key (id),
                             foreign key (user_nickname) references db2021_user(nickname),
                             foreign key (movie_id) references db2021_movie(id)
);