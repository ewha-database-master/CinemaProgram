package clerk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {
    @FXML
    PasswordField clerkPwd;
    @FXML
    Text result;

    public boolean isClerk(String pwd) {
        if(pwd.equals("ewhaCyber19"))
            return true;
        return false;
    }

    @FXML
    private void goOnlyClerkInfo(ActionEvent event) {
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            if(isClerk(clerkPwd.getText())) {
                Parent next = FXMLLoader.load(getClass().getResource("clerkDiscountInfo.fxml"));
                Scene sc = new Scene(next);
                stage.setScene(sc);
                stage.show();
            }
            else {
                result.setText("비밀번호가 올바르지 않습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goBack(ActionEvent event) {
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            Parent next = FXMLLoader.load(getClass().getResource("../discount/discount.fxml"));
            Scene sc = new Scene(next);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
