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

/**
 * <p>clerk.Controller는 할인 정보 창에서 "staff only" 버튼을 눌렀을 때 직원용 메뉴로 이동하고 메서드를 관리하는 컨트롤러입니다.</p>
 * <p>직원임을 조회하기 위해 password를 입력받고, 입력한 password가 일치할 경우 직원만 접근할 수 있는 '할인정보 조회' 기능을 수행합니다.
 * 할인 정보 조회를 위해 호출한 메서드 readDiscountInfo()는 clerk.Model에 정의되어 있습니다. </p>
 */
public class Controller {
    @FXML
    PasswordField clerkPwd;
    @FXML
    Text result;

    /**
     * password를 입력받고, 올바른 패스워드를 입력했는지 여부를 리턴하는 메서드 isClerk()
     */
    public boolean isClerk(String pwd) {
        if(pwd.equals("ewhaCyber19"))
            return true;
        return false;
    }

    /**
     * 입력한 password가 일치할 경우 할인정보 조회 메서드 readDiscountInfo()를 호출하는 goOnlyClerkInfo()
     */
    @FXML
    private void goOnlyClerkInfo(ActionEvent event) {
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            System.out.println(clerkPwd.getText());
            if(isClerk(clerkPwd.getText())) {
                Model model = new Model();
                model.readDiscountInfo();
            }
            else {
                result.setText("비밀번호가 올바르지 않습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * [초기화면]으로 돌아가는 메서드 goBack()
     */
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
