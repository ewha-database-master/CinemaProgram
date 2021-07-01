import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

/**
 * <p>
 * JavaFX 프로젝트에 내장되어있는 start() 메서드를 이용해 첫 화면(main.fxml)을 로딩합니다.
 * </p>
 * <p>
 * JavaFX를 실행하기 위해 Application 라이브러리를 extends 합니다. JDBC Driver를 이용하여 데이터베이스
 * DB2021Team04에 연결합니다.
 * </p>
 *
 * - Author: 사이버데장 (김윤서, 이유림, 윤가영)
 */
public class Main extends Application {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    static final String USER = "DB2021Team04";
    static final String PASS = "DB2021Team04";

    /**
     * <p>
     * 메인화면인 main.fxml 화면을 띄웁니다.
     * </p>
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("롯데베시네마 ~ ♡");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    /**
     * <p>
     * JDBC Driver를 이용하여 데이터베이스 DB2021Team04에 연결합니다.
     * </p>
     */
    public static void main(String[] args) {

        System.out.println("Connecting to database...");
        launch(args);
    }
}