package chart;


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


    // Model에서 받아온 SELECT 결과들 콘솔에 출력
    // 그냥 model 함수 자체가 print 작업해주므로 함수 호출만
    @FXML
    private void sort_btn1(ActionEvent event) {
        model.sort_sql(result1.getText());
    }
    @FXML
    private void sort_btn2(ActionEvent event) {
        model.sort_sql(result2.getText());
    }
    @FXML
    private void sort_btn3(ActionEvent event) {
        model.sort_sql(result3.getText());
    }
}
