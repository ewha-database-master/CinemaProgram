package discount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model { // disocunt.Model
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://database-master.cjg477cwca9i.ap-northeast-2.rds.amazonaws.com";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";

    // 현재 할인하는 영화를 콘솔에 찍어주는 메서드.
    public void getThisMonthDiscount() {
        String str = "select * from db2021_movie_view";
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ) {
            stmt.executeUpdate("use cinema");
            ResultSet rs = stmt.executeQuery(str);
            System.out.println("---------------------------------");
            System.out.println("\t제목     감독");
            System.out.println("---------------------------------");
            while (rs.next()) {
                String title = rs.getString("title");
                String director = rs.getString("director");
                System.out.printf("%10s    %5s\n", title, director);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
