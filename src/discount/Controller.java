package discount;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * <p>discount.Controller는 [메인창- 할인 정보]창으로 이동했을 때의 세부화면 이동과 메서드를 관리하는 컨트롤러입니다.</p>
 * <p>discount.fxml에서 직원용 페이지로 전환하는 메서드 goClerk()과 이전화면으로 돌아가는 메서드 goMenu()가 정의되어 있습니다.
 *  * 해당 컨트롤러의 메서드 내에서 불러오는 함수는 discount.Model에 정의되어 있습니다.</p>
 */
public class Controller {

    @FXML
    private void goClerk (ActionEvent event){ // 직원용 페이지로 전환해주는 메서드
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("../clerk/clerk.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goMenu (ActionEvent event){ // 메인메뉴로 돌아가는 메서드
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
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
