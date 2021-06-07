import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;
/**
 * <p>메인화면의 6개 메뉴 클릭 시, 세부 메뉴창으로 이동하는 메인 Controller</p>
 * <p>각 버튼 chartButton(명작 차트), categoryButton(명작 카테고리),
 * awardButton(수상부문별), likeMovieButton(나의 명작), searchButton(영화 검색) 클릭 시 세부 화면으로 이동</p>
 *
 */
public class Controller { // 메인 Controller
    @FXML
    Button chartButton, categoryButton, awardButton, likeMovieButton, searchButton; // 메뉴 버튼

    /**
     * [영화 차트] 창으로 전환하는 메서드 goChart()
     */
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
    /**
     * [영화 카테고리] 창으로 전환하는 메서드 goCategory()
     */
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
    /**
     * [영화 검색] 창으로 이동하는 메서드 goSearch()
     */
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
    /**
     * [나의 명작] 창으로 전환하는 메서드 goLikes()
     */
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
    /**
     * [영화제 다시보기] 창으로 이동하는 메서드 goAwards()
     */
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
    /**
     * [할인영화] 창으로 이동하는 메서드 goDiscount()
     */
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
