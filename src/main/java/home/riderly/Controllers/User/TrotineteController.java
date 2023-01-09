package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;

import java.net.URL;
import java.util.ResourceBundle;

public class TrotineteController implements Initializable {
    public ImageView trotImg1;
    public Button trotBtn1;
    public ImageView trotImg2;
    public Button trotBtn2;
    public Button returnBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }
    public void addListeners(){
        trotBtn1.setOnAction(event -> onTrotBtn1());
        trotBtn2.setOnAction(event -> onTrotBtn2());
        returnBtn.setOnAction(event -> onReturnBtn());
    }
    private void onTrotBtn1() {
        Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
    }
    private void onTrotBtn2() {
        Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
    }
    private void onReturnBtn(){Model.getInstance().getViewFactory().showPopupWindow2(Modality.APPLICATION_MODAL);}

}
