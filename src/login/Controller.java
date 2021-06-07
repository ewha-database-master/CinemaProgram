package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * <p>login.Controller는 [메인창 - 나의 명작]으로 이동했을 때 사용자를 식별하기 위해 로그인 과정을 진행하는 컨트롤러입니다.</p>
 */
public class Controller {
    @FXML
    TextField idField;

    /**
     * <p>사용자가 id를 입력하면 이를 idField에 넣어 like.Controller로 전달합니다.</p>
     */
    @FXML
    private void idEnter(ActionEvent event) {
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            String nickName = idField.getText();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../like/like.fxml"));
            Parent next = (Parent) loader.load();
            Scene sc = new Scene(next);
            like.Controller likeController = loader.getController();
            likeController.setNickname(nickName);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
