package searchDirector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller_searchDirector {

    private Model_searchDirector model_searchDirector = new Model_searchDirector();
    @FXML
    Button result2;
    @FXML
    private TextField value2;
    private String inputvalue1;


    @FXML
    private void printDirector(ActionEvent event) {

        inputvalue1=value2.getText();
        model_searchDirector.searchDirector(inputvalue1);

    }

}
