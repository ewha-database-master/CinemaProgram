package discount;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private void goClerk (ActionEvent event){
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("../clerk/clerk.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
