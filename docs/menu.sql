/* [명작 차트 조회] */
-- 간단하게 제목이랑 감독 정보만 출력

    -- 모든 영화 조회
SELECT Title,Director FROM db2021_movie;

    -- 현재 상영중인 영화 조회
SELECT Title,Director FROM db2021_movie WHERE Now_Showing='O';

    -- 개봉순 조회
SELECT Title,Director,Released_Year FROM db2021_movie ORDER BY Released_Year;

    -- 가나다순 조회 
SELECT Title,Director FROM db2021_movie ORDER BY Title;


/* 명작 검색 */
-- java에서 검색어 입력 받기
-- 정보 검색이니까 모든 정보 출력하도록 함(*)

-- 1) 제목 입력
SELECT * FROM db2021_movie WHERE Title=?;

-- 2) 감독 입력
SELECT * FROM db2021_movie WHERE Director=?;



/* 명작 카테고리 */
-- 카테고리 (장르, 유형, 언어) 별로 조회 

-- 장르별 (genre=?)
select * from db2021_movie where genre = ?;

-- 유형별: 독립, 상업 (type=?)
select * from db2021_movie where movie_type = ?;

-- 언어별 (lang=?)
select * from db2021_movie as m join db2021_nation as n on(m.nation_id=n.id) where lang = ?;

-- 영화제 별

-- 전체 영화제 별
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id order by film_festival_name;  
-- 미국 아카데미
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="미국 아카데미";  
-- 골든 글로브
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="골든 글로브";  
-- 베니스국제영화제
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="베니스국제영화제";  
-- 부산국제영화제
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="부산국제영화제";  
-- 세자르 영화제
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="세자르 영화제"; 
-- 칸 영화제
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="칸 영화제"; 

-- ----------------------------------
-- 현재 상영중인 영화 별
-- 미국 아카데미
select db2021_movie.title from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="미국 아카데미" and now_showing=true;
-- 골든 글로브
select db2021_movie.title from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="골든 글로브" and now_showing=true;
-- 베니스국제영화제
select db2021_movie.title from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="베니스국제영화제" and now_showing=true;
-- 부산국제영화제
select db2021_movie.title from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="부산국제영화제" and now_showing=true;
-- 세자르 영화제
select db2021_movie.title from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="세자르 영화제" and now_showing=true;
-- 칸 영화제
select db2021_movie.title from db2021_movie left outer join db2021_result on movie_id = id where film_festival_name="칸 영화제" and now_showing=true;
-- ----------------------------------

-- 수상 부문 별
-- 작품상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="작품상";
-- 여우주연상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="여우주연상";
-- 남우주연상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="남우주연상";
-- 각본상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="각본상";
-- 여우조연상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="여우조연상";
-- 황금사자상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="황금사자상";
-- 뉴 커런츠상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="뉴 커런츠상";
-- 신인여우상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="신인여우상";
-- 황금종려상
select db2021_movie.title, db2021_result.film_festival_name from db2021_movie left outer join db2021_result on movie_id = id where awards="황금종려상";


/* 별점 추가 */
insert into db2021_star(movie_id, star, review, nickname)
values
(?, ?, ?, ?);

/* 나의 명작 */
-- 추가
insert into db2021_like(movie_id, user_id)
values (?, ?);

-- 삭제
delete from db2021_like where movie_id = ? and user_id = ?;

-- 조회
select * from db2021_like where user_id = ?;
