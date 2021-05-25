package watchagain;

import javax.swing.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Controller {

    @FXML
    Button festival, now, award;

    @FXML
    private void searchByFestival(ActionEvent event) {
        String festivalName = ((Button)event.getSource()).getText();
        System.out.println(festivalName);
    }

    @FXML
    private void byFestival(ActionEvent event) {
        Stage stage = (Stage)festival.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("filmfestival.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void nowShowing(ActionEvent event) {
        Stage stage = (Stage)festival.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("filmfestival.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
