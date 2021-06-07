package category;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * <p>category.Controller는 [메인창 - 명작 카테고리]창으로 이동했을 때의 세부화면 이동과 메서드를 관리하는 컨트롤러입니다.</p>
 * <p>category.fxml에서 세부화면으로 이동하는 메서드 goGenre()와,
 * 각 세부 화면에서 기능을 수행하는 메서드 genre(), 상업 영화/독립영화를 리턴하는 메서드 commercial(), independent()가 정의되어 있습니다.
 * 해당 컨트롤러의 메서드 내에서 불러오는 함수는 category.Model에 정의되어 있습니다.</p>
 */
public class Controller {
    Model model = new Model();
    @FXML
    Button genre, menu;

    /**
     * 장르별로 영화를 보여주는 메서드 genre()
     */
    @FXML
    private void goGenre(ActionEvent event) {
        Stage stage = (Stage)genre.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("genre.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 장르별로 영화를 보여주는 메서드 genre()
     */
    @FXML
    private void genre(ActionEvent event) {
        model.genre_sql(((Button)event.getSource()).getText());
    }
    /**
     * '상업' 영화를 보여주는 메서드 commercial()
     */
    @FXML
    private void commercial(ActionEvent event) {
        model.category_sql("상업");
    }
    /**
     * '독립' 영화를 보여주는 메서드 independent()
     */
    @FXML
    private void independent(ActionEvent event) {
        model.category_sql("독립");
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
