package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import home.riderly.Models.DatabaseDriver;


import java.net.URL;
import java.util.ResourceBundle;


/**
 * The class Biciclete controller implements initializable
 */
public class BicicleteController implements Initializable {
    public ImageView bicImg1;
    public Button bicBtn1;
    public ImageView bicImg2;
    public Button bicBtn2;
    public ImageView bicImg3;
    public Button bicBtn3;
    public Button returnBtn;

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

        bicBtn1.setOnAction(event -> onBicBtn1());
        bicBtn2.setOnAction(event -> onBicBtn2());
        bicBtn3.setOnAction(event -> onBicBtn3());
        returnBtn.setOnAction(event -> onReturnBtn());
    }
    boolean ok=false;
    String userInchiriat,tipInchiriat;


    /**
     *
     * On bic btn1
     *
     */
    private void onBicBtn1() {

        if(ok){
            Model.getInstance().getViewFactory().showAlert2(Modality.APPLICATION_MODAL);
        }
        else{
            Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
            Model.getInstance().getDatabaseDriver().updateBikeStatus("1","1");
            Model.getInstance().getDatabaseDriver().updateUserStatus("2","1");
            userInchiriat="bobi";
            tipInchiriat="mountain-bike";
            ok=true;
        }
    }

    /**
     *
     * On bic btn2
     *
     */
    private void onBicBtn2() {

        if(ok){
            Model.getInstance().getViewFactory().showAlert2(Modality.APPLICATION_MODAL);
        }
        else{
            Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
            Model.getInstance().getDatabaseDriver().updateBikeStatus("2","1");
            Model.getInstance().getDatabaseDriver().updateUserStatus("2","1");
            userInchiriat="bobi";
            tipInchiriat="city-bike";
            ok=true;
        }
    }

    /**
     *
     * On bic btn3
     *
     */
    private void onBicBtn3() {

        if(ok){
            Model.getInstance().getViewFactory().showAlert2(Modality.APPLICATION_MODAL);
        }
        else{
            Model.getInstance().getViewFactory().showPopupWindow(Modality.APPLICATION_MODAL);
            Model.getInstance().getDatabaseDriver().updateBikeStatus("3","1");
            Model.getInstance().getDatabaseDriver().updateUserStatus("2","1");
            userInchiriat="bobi";
            tipInchiriat="cursiera";
            ok=true;
        }
    }

    /**
     *
     * On return btn
     *
     */
    private void onReturnBtn(){

        if(!ok){
            Model.getInstance().getViewFactory().showAlert3(Modality.APPLICATION_MODAL);
        }
        else{
            Model.getInstance().getViewFactory().showPopupWindow2(Modality.APPLICATION_MODAL);
            Model.getInstance().getDatabaseDriver().updateBikeStatus("1","0");
            Model.getInstance().getDatabaseDriver().updateBikeStatus("2","0");
            Model.getInstance().getDatabaseDriver().updateBikeStatus("3","0");
            Model.getInstance().getDatabaseDriver().updateUserStatus("2","0");
            ok=false;
            Model.getInstance().getDatabaseDriver().insertIntoIstoric(userInchiriat,tipInchiriat);
        }
    }
}
