package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * The class User controller implements initializable
 */
public class UserController implements Initializable {
    public BorderPane clientParent;
    @Override

/**
 *
 * Initialize
 *
 * @param url  the url
 * @param resourceBundle  the resource bundle
 */
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Model.getInstance().getViewFactory().getClientSelMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case "Trotinete" -> clientParent.setCenter(Model.getInstance().getViewFactory().getTrotineteView());
                case "Istoric-Biciclete" -> clientParent.setCenter(Model.getInstance().getViewFactory().getIstoricBicView());
                case "Istoric-Trotinete" -> clientParent.setCenter(Model.getInstance().getViewFactory().getIstoricTrotView());
                case "Report" -> clientParent.setCenter(Model.getInstance().getViewFactory().getReportView());
                default -> clientParent.setCenter(Model.getInstance().getViewFactory().getBicicleteView());
            }
        });
    }
}
