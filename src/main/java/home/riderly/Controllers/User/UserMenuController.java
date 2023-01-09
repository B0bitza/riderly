package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class UserMenuController implements Initializable {
    public Button bicBtn;
    public Button trotBtn;
    public Button logoutBtn;
    public Button repBtn;
    public Button istoricBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }
    public void addListeners(){
        bicBtn.setOnAction(event -> peBiciclete());
        trotBtn.setOnAction(event -> peTrotinete());
        istoricBtn.setOnAction(event -> peIstoric());
        logoutBtn.setOnAction(event -> peLogout());
        repBtn.setOnAction(event -> peReport());
    }
    private void peBiciclete(){
        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Biciclete");
    }
    private void peTrotinete(){
        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Trotinete");
    }
    public void peIstoric(){
        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Istoric");
    }
    private void peLogout() {
        // Get Stage
        Stage stage = (Stage) bicBtn.getScene().getWindow();
        // Close the client window
        Model.getInstance().getViewFactory().closeStage(stage);
        // Show login window
        Model.getInstance().getViewFactory().showLoginWindow();
        // Set clent login success flag to false
        Model.getInstance().setClientLoginSuccessFlag(false);
    }
    public void peReport(){
        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Report");
    }
}
