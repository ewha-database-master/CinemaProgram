package clerk;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * clerk.Model은 직원용 메뉴인 "할인 정보 조회"를 담당하는 함수를 정의하고 있습니다.
 * (여기서 정의된 함수는 clerk.Controller에서 사용됩니다)
 */
public class Model {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://database-master.cjg477cwca9i.ap-northeast-2.rds.amazonaws.com";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";

    public void readDiscountInfo() {
        String str = "select title, discount_start, discount_end from DB2021_MOVIE";
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ) {
            stmt.executeUpdate("use DB2021Team04");
            ResultSet rs = stmt.executeQuery(str);
            System.out.println("\n--------------------------------------------");
            System.out.println("할인 정보 ~ >< SECRET!");
            System.out.println("--------------------------------------------");
            System.out.println("제목   |   할인 시작   |  할인 종료");
            System.out.println("--------------------------------------------");
            while(rs.next()) {
                String title = rs.getString("title");
                Date start = rs.getDate("discount_start");
                Date end = rs.getDate("discount_end");
                System.out.printf("%s |  %10s |  %10s\n", title, start.toString(), end.toString());
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
