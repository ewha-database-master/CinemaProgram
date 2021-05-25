package category;

import java.sql.*;

public class Model {
    //실질적인 기능을 하는 부분 (함수 정의 등)
    // -> 여기서 정의된 함수는 Controller에서 사용됨

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://database-master.cjg477cwca9i.ap-northeast-2.rds.amazonaws.com";

    static final String USER = "admin";
    static final String PASS = "ewhacyber19";

    public void category_sql(String value){

            if(value.equals("장르별")) {
                try (
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                    stmt.executeQuery("use cinema");
                    ResultSet rs = stmt.executeQuery("select * from db2021_movie where genre = ?;");
                    while (rs.next()) {
                        String title = rs.getString(2);
                        String director = rs.getString(4);
                        System.out.print(title);
                        System.out.println("\t" + director);
                    }
                    // Connection, stmt


                } catch(SQLException se) {
                    se.printStackTrace();
                }
            }

            else if(value.equals("언어별")) {
                try (
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                    stmt.executeQuery("use cinema");
                    ResultSet rs = stmt.executeQuery("");
                    while (rs.next()) {
                        String title = rs.getString(2);
                        String director = rs.getString(4);
                        System.out.print(title);
                        System.out.println("\t" + director);

                    }
                } catch(SQLException se) {
                    se.printStackTrace();
                }
            }

            else if(value.equals("장편")) {
                try (
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                    stmt.executeQuery("use cinema");
                    ResultSet rs = stmt.executeQuery("");
                    while (rs.next()) {
                        String title = rs.getString(2);
                        String director = rs.getString(4);
                        System.out.print(title);
                        System.out.println("\t" + director);

                    }
                } catch(SQLException se) {
                    se.printStackTrace();
                }
            }

            else { //단편
                try (
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                    stmt.executeQuery("use cinema");
                    ResultSet rs = stmt.executeQuery("");
                    while (rs.next()) {
                        String title = rs.getString(2);
                        String director = rs.getString(4);
                        System.out.print(title);
                        System.out.println("\t" + director);

                    }
                } catch(SQLException se) {
                    se.printStackTrace();
                }
            }




    }
}
