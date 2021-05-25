package sample.sort;

import java.sql.*;

public class Model {
    //실질적인 기능을 하는 부분 (함수 정의 등)
    // -> 여기서 정의된 함수는 Controller에서 사용됨

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://database-master.cjg477cwca9i.ap-northeast-2.rds.amazonaws.com";

    static final String USER = "admin";
    static final String PASS = "ewhacyber19";

    public void sort_sql(String value){

            if(value.equals("관객순")) {
                try (
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                    stmt.executeQuery("use cinema");
                    ResultSet rs = stmt.executeQuery("SELECT * FROM db2021_movie ORDER BY Released_Year;");
                    while (rs.next()) {
                        String title = rs.getString(2);
                        String eng_title = rs.getString(3);
                        String director = rs.getString(4);
                        System.out.print(title);
                        System.out.print("\t\t\t" + eng_title);
                        System.out.println("\t\t\t" + director);
                    }
                    // Connection, stmt


                } catch(SQLException se) {
                    se.printStackTrace();
                }
            } //return "SELECT Title,Director,Released_Year FROM db2021_movie ORDER BY Released_Year;";

            else if(value.equals("가나다순")) {
                try (
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                    stmt.executeQuery("use cinema");
                    ResultSet rs = stmt.executeQuery("SELECT * FROM db2021_movie ORDER BY Title;");
                    while (rs.next()) {
                        String title = rs.getString(2);
                        String eng_title = rs.getString(3);
                        String director = rs.getString(4);
                        System.out.print(title);
                        System.out.print("\t\t\t" + eng_title);
                        System.out.println("\t\t\t" + director);

                    }
                } catch(SQLException se) {
                    se.printStackTrace();
                }
            } //return "SELECT Title,Director FROM db2021_movie ORDER BY Title;";

            else {
                try (
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                    stmt.executeQuery("use cinema");
                    ResultSet rs = stmt.executeQuery("SELECT * FROM db2021_movie ORDER BY Released_Year;");
                    while (rs.next()) {
                        String title = rs.getString(2);
                        String eng_title = rs.getString(3);
                        String director = rs.getString(4);
                        System.out.print(title);
                        System.out.print("\t\t\t" + eng_title);
                        System.out.println("\t\t\t" + director);

                    }
                } catch(SQLException se) {
                    se.printStackTrace();
                }
                // 개봉순
                //return "SELECT Title,Director,Released_Year FROM db2021_movie ORDER BY Released_Year;";
            }




    }
}
