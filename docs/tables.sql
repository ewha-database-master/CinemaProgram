create table db2021_nation (
  id int not null,
  nation varchar(20) not null,
  lang varchar(10),
  primary key (id)
);

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
  primary key (id),
  foreign key (nation_id) references db2021_nation(id)
);

create table db2021_film_festival (
  name varchar(20) not null,
  festival_year int,
  nation_id int,
  primary key (name, festival_year),
  foreign key (nation_id) references db2021_nation(id)
);

create table db2021_result (
  movie_id int not null,
  film_festival_name varchar(20) not null,
  film_festival_year int not null,
  awards varchar(30),
  primary key (movie_id, film_festival_name, film_festival_year, awards),
  foreign key (film_festival_name, film_festival_year) references db2021_film_festival(name, festival_year),
  foreign key (movie_id) references db2021_movie(id)
);

create table db2021_user (
  nickname varchar(20) not null,
  id varchar(20),
  primary key (id)
);

create table db2021_star (
  id int not null auto_increment,
  movie_id int not null,
  star int not null,
  review varchar(50) not null,
  user_id varchar(20) not null,
  primary key (id),
  foreign key (movie_id) references db2021_movie(id),
  foreign key (user_id) references db2021_user(id)
);

create table db2021_like (
  id int not null auto_increment,
  user_id varchar(20) not null,
  movie_id int not null,
  primary key (id),
  foreign key (user_id) references db2021_user(id),
  foreign key (movie_id) references db2021_movie(id)
);

