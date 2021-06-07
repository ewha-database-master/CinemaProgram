package like;

import java.sql.*;

public class Model {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://database-master.cjg477cwca9i.ap-northeast-2.rds.amazonaws.com";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";


    public void insert(String value, String movie_name) {
        String query = "INSERT INTO db2021_like(user_nickname, movie_id) value (?,(select id from db2021_movie where title=?))";

        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);

        ) {
            //System.out.println(value);

            stmt.executeQuery("use cinema");
            pStmt.setString(1, value);
            pStmt.setString(2, movie_name);
            pStmt.executeUpdate();

            System.out.println("나의 명작 추가가 완료되었습니다.\n");
            System.out.println("---------------------------------------------------------------\n");

        } catch (SQLException se) {
            System.out.println("error");
            se.printStackTrace();
        }
    }

    public void delete(String value, String movie_id) {
        String query = "DELETE FROM DB2021_like where user_nickname=? and movie_id=(select id from db2021_movie where title=?)";

        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);

        ) {
            stmt.executeQuery("use cinema");
            pStmt.setString(1, value);
            pStmt.setString(2, movie_id);
            pStmt.executeUpdate();

            System.out.println("나의 명작 삭제가 완료되었습니다.\n");
            System.out.println("---------------------------------------------------------------\n");
        } catch (SQLException se) {
            System.out.println("error");
            se.printStackTrace();
        }
    }
    public void select(String value) {
        String query = "SELECT user_nickname,movie_id,title FROM db2021_like INNER JOIN db2021_movie on db2021_like.movie_id=db2021_movie.id where user_nickname=?";
        //String for_movie_name = "SELECT * FROM db2021_movie where id=?";

        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);

        ) {
            stmt.executeQuery("use cinema");
            pStmt.setString(1, value);
            ResultSet rs = pStmt.executeQuery();

            if(!rs.next()){
                System.out.print("\""+value+"\"");
                System.out.println("님이 찜한 영화가 없습니다.\n");
                System.out.println("---------------------------------------------------------------\n");
            }
            else{
                System.out.print("\""+value+"\"");
                System.out.println("님의 '나의 명작' 결과입니다.");
                do {
                    String user = rs.getString(1);
                    String movie_id = rs.getString(2);
                    String movie_name = rs.getString(3);
                    System.out.print(user);
                    System.out.print("\t\t\t" + movie_id);
                    System.out.print("\t\t\t" + movie_name);
                    System.out.println();
                } while (rs.next());
            }

        } catch (SQLException se) {
            System.out.println("error");
            se.printStackTrace();
        }
    }
}