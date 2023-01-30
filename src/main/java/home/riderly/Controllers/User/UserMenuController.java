package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * The class User menu controller implements initializable
 */
public class UserMenuController implements Initializable {
    public Button bicBtn;
    public Button trotBtn;
    public Button logoutBtn;
    public Button repBtn;
    public Button istoricBicBtn;
    public Button istoricTrotBtn;

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

        bicBtn.setOnAction(event -> peBiciclete());
        trotBtn.setOnAction(event -> peTrotinete());
        istoricBicBtn.setOnAction(event -> peIstoricBic());
        istoricTrotBtn.setOnAction(event -> peIstoricTrot());
        logoutBtn.setOnAction(event -> peLogout());
        repBtn.setOnAction(event -> peReport());
    }

    /**
     *
     * Pe biciclete
     *
     */
    private void peBiciclete(){

        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Biciclete");
    }

    /**
     *
     * Pe trotinete
     *
     */
    private void peTrotinete(){

        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Trotinete");
    }

    /**
     *
     * Pe istoric bic
     *
     */
    public void peIstoricBic(){

        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Istoric-Biciclete");
    }

    /**
     *
     * Pe istoric trot
     *
     */
    public void peIstoricTrot(){

        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Istoric-Trotinete");
    }


    /**
     *
     * Pe logout
     *
     */
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

    /**
     *
     * Pe report
     *
     */
    public void peReport(){

        Model.getInstance().getViewFactory().getClientSelMenuItem().set("Report");
    }
}
