package watchagain;

import java.sql.*;

public class Model {
    static final String DB_URL = "jdbc:mysql://database-master.cjg477cwca9i.ap-northeast-2.rds.amazonaws.com";
    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";
    public void searchByFestival(String festival) {
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            PreparedStatement pStmt = conn.prepareStatement("select title, awards from DB2021_MOVIE join DB2021_RESULT on (DB2021_RESULT.movie_id=DB2021_MOVIE.id and DB2021_RESULT.film_festival_name=?)");
            ) {
            stmt.executeQuery("use DB2021Team04");
            pStmt.setString(1, festival);
            ResultSet rs = pStmt.executeQuery();
            System.out.println("영화제별 보기: <"+festival+">");
            System.out.println("------------------------------------------");
            while(rs.next()) {
                String title = rs.getString(1);
                String awards = rs.getString(2);
                System.out.printf("%-20s|  %-10s\n", title, awards);
            }
            System.out.println("------------------------------------------");
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void printNowShowing() {
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ) {
            stmt.executeQuery("use DB2021Team04");
            ResultSet rs = stmt.executeQuery("select title, director, genre, lang from DB2021_MOVIE join DB2021_NATION on (DB2021_MOVIE.nation_id=DB2021_NATION.id) where now_showing=true");
            System.out.println("\n현재 상영 중인 명작들 ~ ◟( ˘ ³˘)◞ ♡");
            System.out.printf("%-30s| %-20s| %-20s| %-20s\n", "제목", "감독", "장르", "언어");
            System.out.println("-----------------------------------------------------------------------------");
            while(rs.next()) {
                String title = rs.getString(1);
                String director = rs.getString(2);
                String genre = rs.getString(3);
                String lang = rs.getString(4);

                System.out.printf("%-30s| %-20s| %-20s| %-20s\n", title, director, genre, lang);
            }
            System.out.println("-----------------------------------------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void searchByAward(String award) {
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            PreparedStatement pStmt = conn.prepareStatement("select title, film_festival_name from DB2021_MOVIE join DB2021_RESULT on (DB2021_RESULT.movie_id=DB2021_MOVIE.id and DB2021_RESULT.awards=?)");
        ) {
            stmt.executeQuery("use DB2021Team04");
            pStmt.setString(1, award);
            ResultSet rs = pStmt.executeQuery();
            System.out.println("수상별 보기: <"+award+">");
            System.out.println("------------------------------------------");
            while(rs.next()) {
                String title = rs.getString(1);
                String filmFestivalName = rs.getString(2);
                System.out.printf("%-20s|  %-10s\n", title, filmFestivalName);
            }
            System.out.println("------------------------------------------");
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
