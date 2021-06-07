package search;

import java.sql.*;

/**
 * search.Model은 [명작 검색] 메뉴에서 감독별/제목별로 검색하는 기능을 제공하는 함수를 정의하고 있습니다. (여기서 정의된 함수는
 * search.Controller에서 사용됩니다) 고객에게 필요한 정보만을 출력해주기 위해 View를 정의해 사용합니다.
 */
public class Model {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";

    public void searchDirector(String value) {
        String query = "SELECT * FROM DB2021_MOVIE_SEARCH_VIEW WHERE director = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);

        ) {
            stmt.executeQuery("use DB2021Team04");
            pStmt.setString(1, value);
            ResultSet rs = pStmt.executeQuery();

            if (!rs.next()) {
                System.out.print("\"" + value + "\"");
                System.out.println("로 검색한 결과가 없습니다.\n");
            } else {
                do {
                    System.out.print("\"" + value + "\"");
                    System.out.println("로 검색한 결과입니다.");
                    String title = rs.getString("title");
                    String eng_title = rs.getString("eng_title");
                    String director = rs.getString("director");
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

    public void searchTitle(String value) {
        String query = "SELECT * FROM DB2021_MOVIE_SEARCH_VIEW WHERE title = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                PreparedStatement pStmt = conn.prepareStatement(query);

        ) {
            stmt.executeQuery("use DB2021Team04");
            pStmt.setString(1, value);
            ResultSet rs = pStmt.executeQuery();

            if (!rs.next()) {
                System.out.print("\"" + value + "\"");
                System.out.println("로 검색한 결과가 없습니다.\n");
            } else {
                do {
                    System.out.print("\"" + value + "\"");
                    System.out.println("로 검색한 결과입니다.");
                    String title = rs.getString("title");
                    String eng_title = rs.getString("eng_title");
                    String director = rs.getString("director");
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
    }}

    

    
    
