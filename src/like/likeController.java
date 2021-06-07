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

public class likeController {
    @FXML
    Text myNickname;
    String nickname;

    public void ssetNickname(String nickname) {
        this.nickname = nickname;
        //System.out.println(this.nickname);
        myNickname.setText(this.nickname);
    }
    private Model model = new Model();
    @FXML
    Button menu; //메뉴로 돌아가는 버튼


    @FXML
    private TextField movie_id;

    @FXML
    private void insert_like(ActionEvent event){
        model.insert(myNickname.getText(), movie_id.getText()); // fxml에 fx:id="movie_id"만 추가해주면 ok
    }
    @FXML
    private void delete_like(ActionEvent event){
        model.delete(myNickname.getText(), movie_id.getText());
    }

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
