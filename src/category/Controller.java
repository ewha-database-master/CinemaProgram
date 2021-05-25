package category;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Controller {
    @FXML
    Button genre, menu;

    @FXML
    private void genre(ActionEvent event) {
        Stage stage = (Stage)genre.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("genre.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    @FXML
    private void longTime(ActionEvent event) {
        // 모델에서 쿼리 수행
    };

    @FXML
    private void shortTime(ActionEvent event) {
        // 마찬가지
    };

    @FXML
    private void goMenu(ActionEvent event) {
        Stage stage = (Stage)menu.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("../main.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}
