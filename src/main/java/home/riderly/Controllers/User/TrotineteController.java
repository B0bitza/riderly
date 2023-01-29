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
    boolean ok=false;
    String userInchiriat,tipInchiriat;

    private void onTrotBtn1() {
        if(ok){
            Model.getInstance().getViewFactory().showAlert2(Modality.APPLICATION_MODAL);
        }
        else{
            Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
            Model.getInstance().getDatabaseDriver().updateTrotStatus("1","1");
            Model.getInstance().getDatabaseDriver().updateUserStatus("2","1");
            userInchiriat="bobi";
            tipInchiriat="xiaomi";
            ok=true;
        }
    }
    private void onTrotBtn2() {
        if(ok){
            Model.getInstance().getViewFactory().showAlert2(Modality.APPLICATION_MODAL);
        }
        else{
            Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
            Model.getInstance().getDatabaseDriver().updateTrotStatus("2","1");
            Model.getInstance().getDatabaseDriver().updateUserStatus("2","1");
            userInchiriat="bobi";
            tipInchiriat="kugoo";
            ok=true;
        }
    }
    private void onReturnBtn(){
        if(!ok){
            Model.getInstance().getViewFactory().showAlert3(Modality.APPLICATION_MODAL);
        }
        else{
            Model.getInstance().getViewFactory().showPopupWindow2(Modality.APPLICATION_MODAL);
            Model.getInstance().getDatabaseDriver().updateTrotStatus("1","0");
            Model.getInstance().getDatabaseDriver().updateTrotStatus("2","0");
            Model.getInstance().getDatabaseDriver().updateUserStatus("2","0");
            ok=false;
            Model.getInstance().getDatabaseDriver().insertIntoIstoric2(userInchiriat,tipInchiriat);
        }
    }
}
