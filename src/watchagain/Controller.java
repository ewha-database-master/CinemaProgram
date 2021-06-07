package watchagain;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * <p>watchagain.Controller는 메인창에서 [영화제 다시보기]창으로 이동했을 때의 세부화면 이동과 메서드를 관리하는 컨트롤러입니다.</p>
 * <p></p>
 */
public class Controller {
    /**
     * watchagain.Model 객체를 생성합니다.
     */
    Model model = new Model();

    /**
     * FXML 파일에서 지정해준 id로 버튼을 불러옵니다.
     */
    @FXML
    Button festival, now, award, menu;

    /**
     * [영화제 별로 보기] 창으로 이동하는 메서드 byFestival()
     */
    @FXML
    private void byFestival(ActionEvent event) {
        Stage stage = (Stage)festival.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("filmfestival.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * [현재 상영 중인 영화 조회] 창으로 이동하는 메서드 nowShowing()
     */
    @FXML
    private void nowShowing(ActionEvent event) { // 현재 상영 중인 영화 조회
        model.printNowShowing();
    }
    /**
     * [수상 부문 별로 보기] 창으로 이동하는 메서드 byAward()
     */
    @FXML
    private void byAward(ActionEvent event) { // 수상 부문별 조회
        Stage stage = (Stage)festival.getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("awards.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 각 영화제 별로 상영한 영화를 DB에서 조회해 콘솔에 출력하는 메서드 searchByFestival()
     */
    @FXML
    private void searchByFestival(ActionEvent event) {
        String festivalName = ((Button)event.getSource()).getText();
        // 영화제 별로 조회하기
        model.searchByFestival(festivalName);
    }
    /**
     * 각 수상부문 별 영화를 DB에서 조회해 콘솔에 출력하는 메서드 awardType()
     */
    @FXML
    private void awardType(ActionEvent event) {
        String awardName = ((Button)event.getSource()).getText();
        // awardName으로 조회하기
        model.searchByAward(awardName);
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
