package home.riderly.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class BicicleteController implements Initializable {
    public ImageView bicImg1;
    public Button bicBtn1;
    public ImageView bicImg2;
    public Button bicBtn2;
    public ImageView bicImg3;
    public Button bicBtn3;

    public void initialize() {
        bicImg1.setImage(new javafx.scene.image.Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/bicicleta1.jpg"))));
        bicImg2.setImage(new javafx.scene.image.Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/bicicleta2.jpg"))));
        bicImg3.setImage(new javafx.scene.image.Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/bicicleta3.jpg"))));
    }

    public void bicBtn1Action() {
        System.out.println("Bicicleta 1");
    }

    public void bicBtn2Action() {
        System.out.println("Bicicleta 2");
    }

    public void bicBtn3Action() {
        System.out.println("Bicicleta 3");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
