package search;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
/**
 * <p>search.Controller는 메인창에서 [영화 검색]창으로 이동했을 때의 세부화면 이동과 메서드를 관리하는 컨트롤러입니다.</p>
 * <p>search.fxml에서 세부화면으로 이동하는 메서드 searchByTitle(),searchByDirector()와,
 * 각 세부 화면에서 기능을 수행하는 메서드 printDirector(), printTitle()가 정의되어 있습니다.
 * 해당 컨트롤러에서 사용되는 메서드는 search.Model에 정의되어 있습니다.</p>
 */
public class Controller {
    /**
     * search.Model 객체를 생성합니다.
     */
    private Model model = new Model();

    @FXML
    Button menu;
    /**
     * [제목으로 검색하기] 창으로 이동하는 메서드 searchByTitle()
     */
    @FXML
    private void searchByTitle(ActionEvent event) {
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("search_title.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
    /**
     * [감독으로 검색하기] 창으로 이동하는 메서드 searchByDirector()
     */
    @FXML
    private void searchByDirector(ActionEvent event) {
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("search_director.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    @FXML
    private TextField value;
    /**
     * 감독명으로 검색하여 결과를 콘솔에 출력하는 메서드 printDirector()
     */
    @FXML
    private void printDirector(ActionEvent event) {
        model.searchDirector(value.getText());
    }
    /**
     * 영화 제목으로 검색하여 결과를 콘솔에 출력하는 메서드 printTitle()
     */
    @FXML
    private void printTitle(ActionEvent event) {
        model.searchTitle(value.getText());
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
