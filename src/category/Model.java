package category;

import java.sql.*;

/**
 * category.Model은 [명작 카테고리] 메뉴의 실질적인 기능을 담당하는 함수를 정의하고 있습니다. (여기서 정의된 함수는
 * category.Controller에서 사용됩니다)
 */
public class Model {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";

    public void category_sql(String value) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement("select * from DB2021_MOVIE where movie_type=?");) {
            stmt.executeQuery("use DB2021Team04");
            pStmt.setString(1, value);
            ResultSet rs = pStmt.executeQuery();
            System.out.println("\n--------------------------------------------");
            System.out.println(value + " 영화 검색 결과 ~ ><");
            System.out.println("--------------------------------------------");
            while (rs.next()) {
                String title = rs.getString(2);
                String director = rs.getString(4);
                System.out.print("<" + title + ">");
                System.out.println("\t" + director);

            }
            System.out.println("--------------------------------------------");
        } catch (SQLException se) {
            se.printStackTrace();
        }

    };

    public void genre_sql(String genre) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement("select * from DB2021_MOVIE where genre = ?");) {
            stmt.executeQuery("use DB2021Team04");
            pStmt.setString(1, genre);
            ResultSet rs = pStmt.executeQuery();
            System.out.println("----------------------------");
            System.out.println("장르 검색 결과: \"" + genre + "\"");
            System.out.println("----------------------------");
            while (rs.next()) {
                String title = rs.getString(2);
                String director = rs.getString(4);
                System.out.print("<" + title + ">");
                System.out.println("\t" + director);
            }
            // Connection, stmt
            System.out.println("----------------------------");
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}