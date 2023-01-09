package home.riderly.Controllers;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public Label userLbl;
    public Label passLbl;
    public Button loginBtn;
    public Label errLbl;
    public TextField userField;
    public PasswordField passField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginBtn.setOnAction(event -> onLogin());
    }
    private void onLogin() {
        Stage stage = (Stage) errLbl.getScene().getWindow();
        // Evaluate Client Login Credentials
        Model.getInstance().evaluateClientCred(userField.getText(), passField.getText());
        if (Model.getInstance().getClientLoginSuccessFlag()) {
            Model.getInstance().getViewFactory().showClientWindow();
            // Close the login stage
            Model.getInstance().getViewFactory().closeStage(stage);
        } else {
            userField.setText("");
            passField.setText("");
            errLbl.setText("Credidentiale gresite - incearca din nou");
        }
    }
}
