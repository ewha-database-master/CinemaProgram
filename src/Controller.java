import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Controller { // 메인 Controller
    @FXML
    Button chartButton, categoryButton, awardButton, likeMovieButton, searchButton; // 메뉴 버튼

    @FXML
    private void goChart(ActionEvent event) { // 영화차트로 전환하는 메서드
        Stage stage = (Stage)chartButton.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("./chart/chart_main.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goCategory(ActionEvent event) { // 카테고리로 전환하는 메서드
        Stage stage = (Stage)categoryButton.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("./category/category.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goSearch(ActionEvent event) { // 영화 검색으로 넘어가는 메서드
        Stage stage = (Stage)searchButton.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("./search/search_main.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goLikes(ActionEvent event) { // 나의 명작으로 넘어가는 메서드
        Stage stage = (Stage)likeMovieButton.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("./login/login.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goAwards(ActionEvent event) { // 영화제별 다시보기로 넘어가는 메서드
        Stage stage = (Stage)awardButton.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("./watchagain/watchagain.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goDiscount(ActionEvent event) { // 할인영화 확인하는 화면으로 전환
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            discount.Model model = new discount.Model();
            model.getThisMonthDiscount();
            Parent next = FXMLLoader.load(getClass().getResource("./discount/discount.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
