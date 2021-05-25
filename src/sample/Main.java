package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://database-master.cjg477cwca9i.ap-northeast-2.rds.amazonaws.com";

    static final String USER = "admin";
    static final String PASS = "ewhacyber19";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("select/select.fxml"));
        primaryStage.setTitle("롯데베시네마 ~ ♡");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        System.out.println("Connecting to database...");
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ) {
            stmt.executeQuery("use cinema");
            /*
            ResultSet rs = stmt.executeQuery("SELECT * FROM db2021_movie");
            while (rs.next()) {
                String title = rs.getString(2);
                String eng_title = rs.getString(3);
                String director = rs.getString(4);
                System.out.print(title);
                System.out.print("\t\t\t"+eng_title);
                System.out.println("\t\t\t"+director);
            }
             */
        } catch(SQLException se) {
            se.printStackTrace();
        }
        launch(args);
    }
}
