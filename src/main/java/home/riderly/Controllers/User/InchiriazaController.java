package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class InchiriazaController implements Initializable {
    public Button okBtn;
    //when okBtn is pressed, close the popup window
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }
    public void addListeners(){
        okBtn.setOnAction(event -> onOkBtn());
    }
    private void onOkBtn() {
        Scene scene = okBtn.getScene();
        Stage stage = (Stage) scene.getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
    }

}
