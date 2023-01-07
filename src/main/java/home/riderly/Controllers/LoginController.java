package home.riderly.Controllers;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public Label userLbl;
    public TextField user_txt;
    public Label passLbl;
    public TextField passTxt;
    public Button loginBtn;
    public Label errLbl;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginBtn.setOnAction(event -> onLogin());
    }
    private void onLogin(){
        Stage stage = (Stage) errLbl.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
