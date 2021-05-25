package category;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    private Model model = new Model();

    @FXML
    Button result1;
    @FXML
    Button result2;
    @FXML
    Button result3;
    @FXML
    Button result4;

    // Model에서 받아온 SELECT 결과들 콘솔에 출력
    // 그냥 model 함수 자체가 print 작업해주므로 함수 호출만
    @FXML
    private void category_btn1(ActionEvent event) {
        model.category_sql(result1.getText());
    }
    @FXML
    private void category_btn2(ActionEvent event) {
        model.category_sql(result2.getText());
    }
    @FXML
    private void category_btn3(ActionEvent event) {
        model.category_sql(result3.getText());
    }
    @FXML
    private void category_btn4(ActionEvent event) {
        model.category_sql(result4.getText());
    }
}
