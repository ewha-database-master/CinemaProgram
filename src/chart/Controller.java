package chart;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * <p>chart.Controller는 [메인창- 명작 차트] 창으로 이동했을 때의 세부화면 이동과 메서드를 관리하는 컨트롤러입니다.</p>
 * <p>모든 영화차트를 정렬해서 사용자에게 보여줍니다.</p>
 */
public class Controller {

    private Model model = new Model();
    @FXML
    Button menu;

    /**
     * Model에서 가나다순,개봉순으로 차트를 정렬해 보여주는 메서드 printChart()
     */
    @FXML
    private void printChart(ActionEvent event) {
        model.sort_sql(((Button)event.getSource()).getText());
    }

    /**
     * [메인메뉴] 창으로 돌아가는 메서드 goMenu()
     */
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
    }
}