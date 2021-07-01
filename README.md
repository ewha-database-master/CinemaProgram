# 데이터베이스(02) 팀프로젝트 레포트

## 롯데베시네마

개발자: 사이버데장 (1971063 김윤서 1971079 윤가영 1971082 이유림)

## 1. 프로젝트 개요

### (1) 프로그램 설명

‘롯데베시네마 – 집에서 다시 보는 명작’ 프로그램은 여러 명작 영화 Database를 기반으로 사용자가 편리하게 카테고리별, 영화제별 명작을 검색하거나 조회하고, 사용자가 특정 영화를 ‘나의 명작’에 추가하여 자신이 원하는 명작 리스트를 조회할 수 있는 명작 다시보기 프로그램이다.

### (2) 프로젝트 준비 (Intellij 기준)

- JDBC 연결

    Mysql-connector-java-버전 압축파일 다운

    → Project Settings-Libraries탭의 +를 눌러 Java 선택

    → mysql-connector-java-버전-bin.jar를 선택

- JavaFX 설치 및 연결

    JavaFX 다운

    → JDK에 JavaFX 추가

    → Run-Edit Configurations-Application-Main 선택

    → Modify options-Add VM options 선택

    → `--module-path /path/to/javafx/sdk --add-modules javafx.controls,javafx.fxml` 추가

    - OpenJDK 14를 쓰는 경우

    → `-add-exports javafx.graphics/com.sun.javafx.sg.prism=ALL-UNNAMED` 추가

## 2. 프로그램 세부사항

### **(1) ERD**   
![Untitled](https://user-images.githubusercontent.com/61778930/121806199-e638cc80-cc89-11eb-8610-db4fa82cb586.png)


### **(2) Schema Diagram**   

![Untitled 1](https://user-images.githubusercontent.com/61778930/121806197-e20caf00-cc89-11eb-81eb-cf793c20e8aa.png)


## 3. 실행화면

### (1) 메인메뉴
![Untitled 14](https://user-images.githubusercontent.com/61778930/121806410-bb9b4380-cc8a-11eb-81b3-ce7876a4976e.png)

1. 명작 차트   
2. 명작 카테고리   
3. 명작 검색   
4. 나의 명작   
5. 영화제 다시보기   
6. 할인 영화  
  
### (2) 명작차트

메뉴 고르기 👻   
![Untitled 15](https://user-images.githubusercontent.com/61778930/121806414-c05ff780-cc8a-11eb-9032-975125cd29dd.png)

- 가나다순 차트   
![Untitled 16](https://user-images.githubusercontent.com/61778930/121806420-c524ab80-cc8a-11eb-978c-784cfd4489a7.png)

- 개봉순 차트   
![Untitled 17](https://user-images.githubusercontent.com/61778930/121806422-c655d880-cc8a-11eb-85c6-6e138b0d8c60.png)

### (3) 카테고리별 영화 보기

원하는 장르의 영화를 찾아볼 수 있음   
![Untitled 18](https://user-images.githubusercontent.com/61778930/121806436-d2da3100-cc8a-11eb-80ff-f2cbe42ec1be.png)
![Untitled 19](https://user-images.githubusercontent.com/61778930/121806437-d372c780-cc8a-11eb-9f46-e18d513ebc93.png)
![Untitled 20](https://user-images.githubusercontent.com/61778930/121806438-d40b5e00-cc8a-11eb-86a2-0a180987d88b.png)
![Untitled 21](https://user-images.githubusercontent.com/61778930/121806439-d40b5e00-cc8a-11eb-8c94-947d2be12448.png)


### (4) 명작 검색  

제목/감독으로 원하는 영화를 찾을 수 있음   

!![Untitled 22](https://user-images.githubusercontent.com/61778930/121806447-d8d01200-cc8a-11eb-8c44-d7be881314c1.png)

- 제목   

![Untitled 23](https://user-images.githubusercontent.com/61778930/121806450-dcfc2f80-cc8a-11eb-8022-4a8505402083.png)
![Untitled 24](https://user-images.githubusercontent.com/61778930/121806457-e2f21080-cc8a-11eb-80b3-46966c4e07fd.png)


- 감독 검색   

![Untitled 25](https://user-images.githubusercontent.com/61778930/121806462-e84f5b00-cc8a-11eb-99e1-a79a35b009bd.png)
![Untitled 26](https://user-images.githubusercontent.com/61778930/121806463-e9808800-cc8a-11eb-8453-2ac492356a91.png)


### (5) 나의 명작

사용자가 원하는 명작을 '나의 명작'에 추가, 삭제하고 조회할 수 있음   
![Untitled 27](https://user-images.githubusercontent.com/61778930/121806468-edaca580-cc8a-11eb-8b90-1f21a3838f06.png)   
![Untitled 28](https://user-images.githubusercontent.com/61778930/121806473-ef766900-cc8a-11eb-9f78-5503263653f2.png)   
![Untitled 29](https://user-images.githubusercontent.com/61778930/121806476-f00eff80-cc8a-11eb-918e-d43e2abacb0f.png)   
![Untitled 30](https://user-images.githubusercontent.com/61778930/121806478-f1402c80-cc8a-11eb-9259-02717a324faa.png)   
![Untitled 31](https://user-images.githubusercontent.com/61778930/121806491-fdc48500-cc8a-11eb-8101-feb5e4b27d80.png)   
![Untitled 32](https://user-images.githubusercontent.com/61778930/121806494-0026df00-cc8b-11eb-8273-6f14a1619d19.png)   


### (6) 영화제 다시보기

영화제별로, 수상부문 별, 수상 작품 중 현재 상영 중인 영화를 조회할 수 있음     

![Untitled 33](https://user-images.githubusercontent.com/61778930/121806502-0c12a100-cc8b-11eb-8bf5-ba06165af10d.png)
![Untitled 34](https://user-images.githubusercontent.com/61778930/121806504-0cab3780-cc8b-11eb-9dcc-01642cf695af.png)
![Untitled 37](https://user-images.githubusercontent.com/61778930/121806550-4419e400-cc8b-11eb-9f28-ec8315180ed7.png)


- 영화제 별 보기   
![Untitled 35](https://user-images.githubusercontent.com/61778930/121806513-116feb80-cc8b-11eb-9bfc-7434e46c7733.png)


- 현재 상영 중인 영화 보기   
![Untitled 36](https://user-images.githubusercontent.com/61778930/121806516-1339af00-cc8b-11eb-835f-7af9123881c2.png)

 
- 수상 부문 별로 보기   
![Untitled 38](https://user-images.githubusercontent.com/61778930/121806544-3e240300-cc8b-11eb-8900-8194d3f597b2.png)


### (7) 할인 영화 확인

사용자 - 이번 달 할인 영화의 목록을 조회할 수 있음  

직원 - 전체 할인 영화 목록을 조회할 수 있음   
![Untitled 39](https://user-images.githubusercontent.com/61778930/121806567-5005a600-cc8b-11eb-9925-0c1d1f893d71.png)
![Untitled 40](https://user-images.githubusercontent.com/61778930/121806569-5005a600-cc8b-11eb-9527-f9870ce1f66c.png)

![Untitled 41](https://user-images.githubusercontent.com/61778930/121806558-4e3be280-cc8b-11eb-9f0a-5c6838d43c82.png)
![Untitled 42](https://user-images.githubusercontent.com/61778930/121806564-4f6d0f80-cc8b-11eb-80d5-5655ce30422b.png)

## **4. Class 및 Method**

- 각 패키지는 화면에 따라 분배하였습니다.

    ### 1. 메인 Controller Class

    : 메인 메뉴를 담당합니다.
![Untitled 2](https://user-images.githubusercontent.com/61778930/121806217-036d9b00-cc8a-11eb-9cba-9f1733bc0bbb.png)


    ### 2.  chart.Controller Class
![Untitled 3](https://user-images.githubusercontent.com/61778930/121806226-09fc1280-cc8a-11eb-9d17-9e24ce71aa5e.png)

### 3. search.Controller, search.Model Class
![Untitled 4](https://user-images.githubusercontent.com/61778930/121806235-0cf70300-cc8a-11eb-813b-0822844daa18.png)

![Untitled 5](https://user-images.githubusercontent.com/61778930/121806246-11bbb700-cc8a-11eb-924d-b1893dc92d0c.png)

### 4. like.Controller, like.Model
![Untitled 6](https://user-images.githubusercontent.com/61778930/121806254-17b19800-cc8a-11eb-8c51-c096d07c042c.png)
![Untitled 7](https://user-images.githubusercontent.com/61778930/121806257-18e2c500-cc8a-11eb-83e9-143af938b473.png)


### 5. clerk.Controller, clerk.Model
![Untitled 8](https://user-images.githubusercontent.com/61778930/121806260-1da77900-cc8a-11eb-8a8e-dd663ced81b7.png)
![Untitled 9](https://user-images.githubusercontent.com/61778930/121806262-1ed8a600-cc8a-11eb-80ce-f3f9fd4850d8.png)

### 6. discount.Controller, discount.Model
![Untitled 10](https://user-images.githubusercontent.com/61778930/121806273-2a2bd180-cc8a-11eb-872c-7552cac9aab6.png)
![Untitled 11](https://user-images.githubusercontent.com/61778930/121806271-28faa480-cc8a-11eb-93dc-0565aa5b953f.png)


### 7. category.Controller, category.Model
![Untitled 12](https://user-images.githubusercontent.com/61778930/121806302-357efd00-cc8a-11eb-959e-512bc9ad24cf.png)
![Untitled 13](https://user-images.githubusercontent.com/61778930/121806304-36179380-cc8a-11eb-96dd-348a523c2bd6.png)


### **(4) SQL문**
<a href="https://github.com/ewha-database-master/CinemaProgram/blob/master/docs/tables.sql">테이블 생성</a> 참고   
<a href="https://github.com/ewha-database-master/CinemaProgram/blob/master/docs/initialInsertion.sql">데이터 삽입</a> 참고   

- 적어도 **2개의 뷰**를 정의해야 한다. (레포트에 view를 사용한 이유를 설명)

```sql
create view DB2021_MOVIE_VIEW(
	id, title, eng_title, director, released_year, movie_type, genre, nation_id)
as (select id, title, eng_title, director, released_year, movie_type, genre, nation_id from DB2021_MOVIE 
where discount_start < now() and discount_end > now());
```

→ 롯데베시네마의 일반 사용자들은 할인 정보를 미리 알면 안되기 때문에, 

직원만 전체 할인 정보를 볼 수 있고 일반 사용자는 이 view를 통해 오늘을 기준으로 해당 월의 할인정보만 볼 수 있게 함.

```sql
create view DB2021_MOVIE_SEARCH_VIEW(
	title, eng_title, director)
as (select title, eng_title, director from DB2021_MOVIE);
```

→ 조회작업이 가장 많이 일어나는 영화 검색에서 필요한 정보인 제목, 영어제목, 감독만 뽑아오는 뷰를 사용함. 우리 영화 db는 새로운 영화가 자주 삽입되지 않으므로 업데이트가 자주 일어나지 않아도 된다.

- 적어도 **4개의 인덱스**를 정의해야 한다.

```sql
create index index_nation on DB2021_NATION(id);
create index index_film_festival on DB2021_FILM_FESTIVAL(name, festival_year);
create index index_result on DB2021_RESULT(movie_id, film_festival_name, film_festival_year, awards);
create index index_movie on DB2021_MOVIE(id);
```

- **인덱스**를 사용하는 쿼리들을 포함해야 한다.

```java
String query = "INSERT INTO DB2021_LIKE(user_nickname, movie_id) value (?,(select id from DB2021_MOVIE where title=?))";
```

- **뷰**를 사용하는 쿼리를 포함해야 한다.

```java
String str = "select * from db2021_movie_view";
```

→ 해당 월의 할인정보만 포함된 view를 사용자가 select하여 볼 수 있음.

```java
String query = "SELECT * FROM DB2021_MOVIE_SEARCH_VIEW WHERE title = ?";
```

→ 사용자가 명작을 검색할 때 전체 정보가 아닌 명작 제목과 영어제목, 감독만 보이게 하는 쿼리문

- **트랜잭션(transaction**)을 포함해야 한다.

```java
public void insert(String value, String movie_name) {
        String query = "INSERT INTO DB2021_LIKE(user_nickname, movie_id) value (?,(select id from DB2021_MOVIE where title=?))";

        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);
                PreparedStatement pStmt2 = conn.prepareStatement("update DB2021_MOVIE set like_count = like_count+1 
								where title = ?");

        ) {
            try {
                stmt.executeQuery("use DB2021Team04");
                conn.setAutoCommit(false);

                pStmt.setString(1, value);
                pStmt.setString(2, movie_name);
                pStmt.executeUpdate();

                pStmt2.setString(1, movie_name);
                pStmt2.executeUpdate();

                System.out.println("나의 명작 추가가 완료되었습니다.\n");
                System.out.println("---------------------------------------------------------------\n");
                conn.commit();
            } catch (SQLException se) {
                se.printStackTrace();
                System.out.println("Rolling back data here...");
                try {
                    if(conn != null)
                        conn.rollback();
                } catch(SQLException se2) {
                    se2.printStackTrace();;
                }
                conn.setAutoCommit(true);

            }

        } catch (SQLException se) {
            System.out.println("error");
            se.printStackTrace();
        }
    }
```

- **중첩된 쿼리(nested query)**들을 가지는 쿼리들을 포함해야 한다.

```sql
String query = "INSERT INTO db2021_like(user_nickname, movie_id) value (?,(select id from db2021_movie where title=?))";

String query = "DELETE FROM DB2021_like where user_nickname=? and movie_id=(select id from db2021_movie where title=?)";
```

- **조인 쿼리**(join query)들을 가지는 쿼리들은 포함해야 한다.

```sql
PreparedStatement pStmt = conn.prepareStatement("select title, awards from db2021_movie join db2021_result 
on (db2021_result.movie_id=db2021_movie.id and db2021_result.film_festival_name=?)");

ResultSet rs = stmt.executeQuery("select title, director, genre, lang from db2021_movie join db2021_nation 
on (db2021_movie.nation_id=db2021_nation.id) where now_showing=true");

PreparedStatement pStmt = conn.prepareStatement("select title, film_festival_name from db2021_movie join db2021_result 
on (db2021_result.movie_id=db2021_movie.id and db2021_result.awards=?)");

String query = "SELECT user_nickname,movie_id,title FROM db2021_like INNER JOIN db2021_movie 
on db2021_like.movie_id=db2021_movie.id where user_nickname=?";
```

- **매개 변수를 가지면서 동적으로 만드는 쿼리를** 포함해야 한다. 다시 말해, 사용자로부터 입력 값을 받고 사용자가 입력한 값으로 쿼리를 생성한다.

```java
public void searchDirector(String value) { //value로 사용자 입력값을 받아옴
        String query = "SELECT * FROM db2021_movie WHERE director = ?";

        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            PreparedStatement pStmt = conn.prepareStatement(query);

        ) {
            stmt.executeQuery("use cinema");
            pStmt.setString(1, value); //PreparedStatement로 입력값으로 쿼리를 생성함
            ResultSet rs = pStmt.executeQuery();

            if(!rs.next()){
                System.out.print("\""+value+"\"");
                System.out.println("로 검색한 결과가 없습니다.\n");
            }
            else{
                do {
                    System.out.print("\""+value+"\"");
                    System.out.println("로 검색한 결과입니다.");
                    String title = rs.getString(2);
                    String eng_title = rs.getString(3);
                    String director = rs.getString(4);
                    System.out.print(title);
                    System.out.print("\t\t\t" + eng_title);
                    System.out.println("\t\t\t" + director);
                    System.out.println();
                } while (rs.next());

            }

        } catch (SQLException se) {
            System.out.println("error");
            se.printStackTrace();
        }
    }
```

- **그래픽 또는 문자 기반의 사용자 인터페이스**를 사용해야 한다. 사용하기 쉽고 **사용하기에 도움이 되는 정보**를 가지고 있는 메뉴를 제공해야 한다.
- 데이터베이스에 삽입(**insert**)을 하기 위한 인터페이스와 쿼리를 가지고 있어야 한다.

```sql
String query = "INSERT INTO db2021_like(user_nickname, movie_id) value (?,(select id from db2021_movie where title=?))";
```

```sql
public void insert(String user_nickname, String movie_name) { 
/* user_nickname 이라는 유저가 movie_name을 title로 가지는 영화를 나의 명작에서 삭제*/ 
}
```

- 데이터베이스에 갱신(**update**)을 하기 위한 인터페이스와 쿼리를 가지고 있어야 한다.

```sql
PreparedStatement pStmt2 = conn.prepareStatement("update DB2021_MOVIE set like_count = like_count+1 where title = ?");
PreparedStatement pStmt2 = conn.prepareStatement("update DB2021_MOVIE set like_count = like_count-1 where title = ?");
```

- 데이터베이스에 삭제(**delete**)를 하기 위한 인터페이스와 쿼리를 가지고 있어야 한다.

```sql
public void delete(String user_nickname, String movie_title) { // search.Model
    // user_nickname 이라는 가진 유저가 movie_title을 나의 명작에서 삭제하는 메서드
}
```

```java
String query = "DELETE FROM DB2021_like where user_nickname=? and movie_id=(select id from db2021_movie where title=?)";
```

- 데이터베이스에 검색(**select**)을 하기 위한 인터페이스와 쿼리를 가지고 있어야 한다.

```java
String query = "SELECT * FROM db2021_movie WHERE title = ?";

String query = "SELECT * FROM db2021_movie WHERE director = ?";

String str = "select title, discount_start, discount_end from db2021_movie";
```
