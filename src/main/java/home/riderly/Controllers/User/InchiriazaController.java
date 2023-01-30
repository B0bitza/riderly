package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * The class Inchiriaza controller implements initializable
 */
public class InchiriazaController implements Initializable {
    public Button okBtn;
    @Override

/**
 *
 * Initialize
 *
 * @param url  the url
 * @param resourceBundle  the resource bundle
 */
    public void initialize(URL url, ResourceBundle resourceBundle) {

        addListeners();
    }

    /**
     *
     * Add listeners
     *
     */
    public void addListeners(){

        okBtn.setOnAction(event -> onOkBtn());
    }

    /**
     *
     * On ok btn
     *
     */
    private void onOkBtn() {

        Scene scene = okBtn.getScene();
        Stage stage = (Stage) scene.getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
    }
}
