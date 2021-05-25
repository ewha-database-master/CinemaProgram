package sample.select;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    @FXML
    Button button;
    @FXML
    private void ok(ActionEvent event) {
        Stage stage = (Stage)button.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("../sort/sort.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
