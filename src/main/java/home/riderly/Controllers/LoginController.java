package home.riderly.Controllers;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public Label selector_lbl;
    public ChoiceBox acc_selector;
    public Label user_lbl;
    public TextField user_txt;
    public Label pass_lbl;
    public TextField pass_txt;
    public Button login_btn;
    public Label err_lbl;

    public void initialize() {
        acc_selector.getItems().addAll("Client", "Administrator");
        acc_selector.setValue("Client");
    }

    public void login_btnAction() {
        System.out.println("Login");
    }

    public void acc_selectorAction() {
        System.out.println("Account selector");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> onLogin());
    }
    private void onLogin(){
        Stage stage = (Stage) err_lbl.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
