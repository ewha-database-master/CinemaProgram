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

public class Controller {
    private Model model = new Model();

    @FXML
    Button menu; //메뉴로 돌아가는 버튼

    String nickname;
    @FXML
    Text showNickname;

    public void setNickname(String nickname) {
        this.nickname = nickname;
        //System.out.println(this.nickname);
        showNickname.setText(this.nickname);
    }

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
    @FXML
    private void goSelect(ActionEvent event){
        model.select(showNickname.getText());
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
