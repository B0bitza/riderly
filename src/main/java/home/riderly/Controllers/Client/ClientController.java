package home.riderly.Controllers.Client;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane clientParent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case "Trotinete" -> clientParent.setCenter(Model.getInstance().getViewFactory().getTrotineteView());
                case "Istoric" -> clientParent.setCenter(Model.getInstance().getViewFactory().getIstoricView());
                default -> clientParent.setCenter(Model.getInstance().getViewFactory().getBicicleteView());
            }
        });
    }
}
