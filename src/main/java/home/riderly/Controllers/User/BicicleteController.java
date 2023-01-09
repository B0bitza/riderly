package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;


import java.net.URL;
import java.util.ResourceBundle;

public class BicicleteController implements Initializable {
    public ImageView bicImg1;
    public Button bicBtn1;
    public ImageView bicImg2;
    public Button bicBtn2;
    public ImageView bicImg3;
    public Button bicBtn3;
    public Button returnBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }
    public void addListeners(){
        bicBtn1.setOnAction(event -> onBicBtn1());
        bicBtn2.setOnAction(event -> onBicBtn2());
        bicBtn3.setOnAction(event -> onBicBtn3());
        returnBtn.setOnAction(event -> onReturnBtn());
    }
    private void onBicBtn1() {
        Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
    }
    private void onBicBtn2() {
        Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
    }
    private void onBicBtn3() {
        Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
    }
    private void onReturnBtn(){Model.getInstance().getViewFactory().showPopupWindow2(Modality.APPLICATION_MODAL);}
}
