package like;

import java.sql.*;

/**
 * like.Model은 고객별로 "나의 명작"을 insert/delete하는 기능을 제공하는 함수를 정의하고 있습니다. (여기서 정의된
 * 함수는 like.Controller에서 사용됩니다)
 */
public class Model {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";

    public void insert(String value, String movie_name) {
        String query = "INSERT INTO DB2021_LIKE(user_nickname, movie_id) value (?,(select id from DB2021_MOVIE where title=?))";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);
                PreparedStatement pStmt2 = conn
                        .prepareStatement("update DB2021_MOVIE set like_count = like_count+1 where title = ?");

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
                    if (conn != null)
                        conn.rollback();
                } catch (SQLException se2) {
                    se2.printStackTrace();
                    ;
                }
                conn.setAutoCommit(true);

            }

        } catch (SQLException se) {
            System.out.println("error");
            se.printStackTrace();
        }
    }

    public void delete(String user_nickname, String movie_title) {
        String query = "DELETE FROM DB2021_LIKE where user_nickname=? and movie_id=(select id from DB2021_MOVIE where title=?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);
                PreparedStatement pStmt2 = conn
                        .prepareStatement("update DB2021_MOVIE set like_count = like_count-1 where title = ?");

        ) {
            try {
                conn.setAutoCommit(false);
                stmt.executeQuery("use DB2021Team04");
                pStmt.setString(1, user_nickname);
                pStmt.setString(2, movie_title);
                pStmt.executeUpdate();
                pStmt2.setString(1, movie_title);
                pStmt2.executeUpdate();
                conn.commit();

                System.out.println("나의 명작 삭제가 완료되었습니다.\n");
                System.out.println("---------------------------------------------------------------\n");
            } catch (SQLException se) {
                se.printStackTrace();
                try {
                    if (conn != null) {
                        conn.rollback();
                    }
                } catch (SQLException se2) {
                    se2.printStackTrace();
                }
                conn.setAutoCommit(true);
            }
        } catch (SQLException se) {
            System.out.println("error");
            se.printStackTrace();
        }
    }

    public void select(String value) {
        String query = "SELECT user_nickname,movie_id,title FROM DB2021_LIKE INNER JOIN DB2021_MOVIE on (DB2021_LIKE.movie_id=DB2021_MOVIE.id and user_nickname=?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);

        ) {
            stmt.executeQuery("use DB2021Team04");
            pStmt.setString(1, value);
            ResultSet rs = pStmt.executeQuery();

            if (!rs.next()) {
                System.out.print("\"" + value + "\"");
                System.out.println("님이 찜한 영화가 없습니다.\n");
                System.out.println("---------------------------------------------------------------\n");
            } else {
                System.out.print("\"" + value + "\"");
                System.out.println("님의 나의 명작 결과입니다.");
                do {
                    String user = rs.getString("user_nickname");
                    String movie_name = rs.getString("title");
                    System.out.print(user);
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