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
/**
 * <p>like.likeController는 [나의 명작] 추가/삭제 기능을 구현할 때
 * 추가/삭제할 '영화 제목 입력'창을 띄우고 Insert/Delete 기능을 수행하는 컨트롤러입니다.</p>
 * <p>해당 컨트롤러의 메서드 내에서 불러오는 함수는 like.Model에 정의되어 있습니다.</p>
 */
public class likeController {
    @FXML
    Text myNickname;
    String nickname;

    /**
     * login 창에서 입력받은 사용자 이름을 전달받는 메서드 ssetNickName()
     */
    public void ssetNickname(String nickname) {
        this.nickname = nickname;
        //System.out.println(this.nickname);
        myNickname.setText(this.nickname);
    }
    /**
     * Insert/Delete 메서드가 정의되어있는 like.Model 객체를 생성합니다.
     */
    private Model model = new Model();
    @FXML
    Button menu; //메뉴로 돌아가는 버튼
    @FXML
    private TextField movie_id;

    /**
     * 사용자가 입력한 영화제목과 사용자 id를 매핑해 '나의 명작' 리스트에 추가하는 메서드 Insert_like()
     */
    @FXML
    private void insert_like(ActionEvent event){ model.insert(myNickname.getText(), movie_id.getText()); }
    /**
     * '나의 명작' 리스트에서 사용자가 입력한 영화제목과 사용자 id를 조회하고 삭제하는 메서드 delete_like()
     */
    @FXML
    private void delete_like(ActionEvent event){
        model.delete(myNickname.getText(), movie_id.getText());
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
