package discount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * discount.Model은 "이번 달 할인 정보"를 고객에게 출력해주는 실질적인 기능을 담당하는 함수를 정의하고 있습니다. (여기서
 * 정의된 함수는 discount.Controller에서 사용됩니다)
 */
public class Model { // discount.Model
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";

    // 현재 할인하는 영화를 콘솔에 찍어주는 메서드.
    public void getThisMonthDiscount() {
        String str = "select * from DB2021_MOVIE_VIEW";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            stmt.executeUpdate("use DB2021Team04");
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
