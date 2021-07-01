use DB2021Team04;

drop table db2021_like;

drop table db2021_star;
 
ALTER TABLE db2021_result DROP INDEX index_result;

drop TABLE db2021_result;

ALTER TABLE db2021_film_festival DROP INDEX index_film_festival;

drop table db2021_film_festival;

DROP VIEW DB2021_MOVIE_SEARCH_VIEW;

DROP VIEW DB2021_MOVIE_VIEW;

ALTER TABLE DB2021_MOVIE DROP INDEX index_movie;

drop table DB2021_MOVIE;

ALTER TABLE DB2021_NATION DROP INDEX index_nation;

drop table DB2021_NATION;

drop database DB2021Team04;
