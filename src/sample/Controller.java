package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class Controller {
    private Model model = new Model();

    @FXML
    private Text result;
    Button button;
//    @FXML
//    private void text(ActionEvent event){
//        result.setText(result.getText()+((Button) event.getSource()).getText());
//    }
    @FXML
    private void textchange(ActionEvent event){
        if(((Button) event.getSource()).getText().equals("Enter")){
            result.setText(model.changeText() + "");
        }
    }
}
