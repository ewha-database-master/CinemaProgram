package searchTitle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller_searchTitle {

    private Model_searchTitle model_searchTitle = new Model_searchTitle();
    @FXML
    Button result1;
    @FXML
    private TextField value1;
    private String inputvalue;


    @FXML
    private void printTitle(ActionEvent event) {

        inputvalue=value1.getText();
        model_searchTitle.searchTitle(inputvalue);

    }

}
