package home.riderly.Controllers.Client;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class BicicleteController implements Initializable {
    public ImageView bicImg1;
    public Button bicBtn1;
    public ImageView bicImg2;
    public Button bicBtn2;
    public ImageView bicImg3;
    public Button bicBtn3;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void addListeners2(){
        bicBtn1.setOnAction(event -> peInchiriaza());
    }
    private void peInchiriaza(){Model.getInstance().getViewFactory().getClientSelMenuItem().set("Inchiriaza");}
}
