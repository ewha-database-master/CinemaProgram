package chart;

import java.sql.*;

/**
 * chart.Model은 [명작 차트] 메뉴의 실질적인 기능을 담당하는 함수를 정의하고 있습니다. (여기서 정의된 함수는
 * chart.Controller에서 사용됩니다)
 */
public class Model {
    // 실질적인 기능을 하는 부분 (함수 정의 등)

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";

    public void sort_sql(String value) {
        int i = 1;
        if (value.equals("가나다 순")) {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement stmt = conn.createStatement();) {
                stmt.executeQuery("use DB2021Team04");
                ResultSet rs = stmt.executeQuery("SELECT title, director FROM DB2021_MOVIE ORDER BY title");
                System.out.println("\n---------------------------------------------------------");
                System.out.println("가나다순 차트 ( ˇ͈ᵕˇ͈ ) ¨̮♡⃛");
                System.out.println("---------------------------------------------------------");
                while (rs.next()) {
                    String title = rs.getString(1);
                    String director = rs.getString(2);
                    System.out.printf("%d. %-20s| %-20s\n", i, title, director);
                    i++;
                }
                System.out.println("---------------------------------------------------------------");
            } catch (SQLException se) {
                se.printStackTrace();
            }
        } // return "SELECT Title,Director FROM db2021_movie ORDER BY Title;";

        else {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement stmt = conn.createStatement();) {
                stmt.executeQuery("use DB2021Team04");
                ResultSet rs = stmt.executeQuery(
                        "SELECT title, director, released_year FROM DB2021_MOVIE ORDER BY Released_Year;");
                System.out.println("\n---------------------------------------------------------------");
                System.out.println("개봉순 차트 ʕ•ﻌ•ʔ ♡");
                System.out.println("---------------------------------------------------------------");
                while (rs.next()) {
                    String title = rs.getString(1);
                    String director = rs.getString(2);
                    int year = rs.getInt(3);
                    System.out.printf("%d. %-20s| %-20s| %-5d\n", i, title, director, year);
                    i++;
                }
                System.out.println("---------------------------------------------------------------");
            } catch (SQLException se) {
                se.printStackTrace();
            }
            // 개봉순
            // return "SELECT Title,Director,Released_Year FROM db2021_movie ORDER BY
            // Released_Year;";
        }
    }
}