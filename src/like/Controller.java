package like;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import like.Model;

/**
 * <p>like.Controller는 로그인 창(login.fxml)에서 id를 입력한 후 명작을 추가/삭제/조회하는 기능을 관리하는 컨트롤러입니다.</p>
 * <p>watchagain.fxml에서 세부화면으로 이동하는 메서드 byFestival(), nowShowing(), byAward()와,
 * 각 세부 화면에서 기능을 수행하는 메서드 searchByFestival(), awardType(), goMenu()가 정의되어 있습니다.
 *  * 해당 컨트롤러의 메서드 내에서 불러오는 함수는 watchagain.Model에 정의되어 있습니다.</p>
 */
public class Controller {
    /**
     * like.Model 객체를 생성합니다.
     */
    private Model model = new Model();

    @FXML
    Button menu; //메뉴로 돌아가는 버튼

    String nickname;
    @FXML
    Text showNickname;

    /**
     * login 창에서 입력받은 사용자 이름을 전달받는 메서드 setNickName()
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
        //System.out.println(this.nickname);
        showNickname.setText(this.nickname);
    }
    /**
     * [나의 명작 추가] 창으로 이동하는 메서드 goInsert()
     */
    @FXML
    private void goInsert(ActionEvent event){
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            String mynickName = showNickname.getText();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("insert_like.fxml"));
            Parent next = (Parent) loader.load();
            Scene sc = new Scene(next);
            like.likeController likelikeController = loader.getController();
            likelikeController.ssetNickname(mynickName);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * [나의 명작 삭제] 창으로 이동하는 메서드 goDelete()
     */
    @FXML
    private void goDelete(ActionEvent event){
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        try {
            String mynickName = showNickname.getText();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("delete_like.fxml"));
            Parent next = (Parent) loader.load();
            Scene sc = new Scene(next);
            like.likeController likelikeController = loader.getController();
            likelikeController.ssetNickname(mynickName);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * [나의 명작 조회] 버튼 클릭 시, 사용자 id를 이용해 '나의 명작' 리스트를 콘솔에 출력하는 메서드 goSelect()
     */
    @FXML
    private void goSelect(ActionEvent event){
        model.select(showNickname.getText());
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
