package home.riderly.Views;

import home.riderly.Controllers.User.UserController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;


/**
 * The class View factory
 */
public class ViewFactory {
    //Client
    private final StringProperty clientSelMenuItem;
    private AnchorPane bicicleteView;
    private AnchorPane trotineteView;
    private AnchorPane istoricBicView;
    private AnchorPane istoricTrotView;
    private AnchorPane reportView;


    /**
     *
     * It is a constructor.
     *
     */
    public ViewFactory() {

        this.clientSelMenuItem = new SimpleStringProperty("");
    }


    /**
     *
     * Gets the client sel menu item
     *
     * @return the client sel menu item
     */
    public StringProperty getClientSelMenuItem() {

        return clientSelMenuItem;
    }


    /**
     *
     * Gets the biciclete view
     *
     * @return the biciclete view
     */
    public AnchorPane getBicicleteView() {

        if (bicicleteView == null) {
            try {
                bicicleteView = new FXMLLoader(getClass().getResource("/Fxml/User/Biciclete.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bicicleteView;
    }


    /**
     *
     * Gets the trotinete view
     *
     * @return the trotinete view
     */
    public AnchorPane getTrotineteView() {

        if (trotineteView == null) {
            try {
                trotineteView = new FXMLLoader(getClass().getResource("/Fxml/User/Trotinete.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return trotineteView;
    }


    /**
     *
     * Gets the istoric bic view
     *
     * @return the istoric bic view
     */
    public AnchorPane getIstoricBicView() {

        if (istoricBicView == null) {
            try {
                istoricBicView = new FXMLLoader(getClass().getResource("/Fxml/User/IstoricBic.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return istoricBicView;
    }


    /**
     *
     * Gets the istoric trot view
     *
     * @return the istoric trot view
     */
    public AnchorPane getIstoricTrotView() {

        if (istoricTrotView == null) {
            try {
                istoricTrotView = new FXMLLoader(getClass().getResource("/Fxml/User/IstoricTrot.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return istoricTrotView;
    }


    /**
     *
     * Show login window
     *
     */
    public void showLoginWindow() {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }



    /**
     *
     * Gets the report view
     *
     * @return the report view
     */
    public AnchorPane getReportView() {

        if (reportView == null) {
            try {
                reportView = new FXMLLoader(getClass().getResource("/Fxml/User/Report.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return reportView;
    }


    /**
     *
     * Show client window
     *
     */
    public void showClientWindow() {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/User/User.fxml"));
        UserController userController = new UserController();
        loader.setController(userController);
        createStage(loader);
    }


    /**
     *
     * Create stage
     *
     * @param loader  the loader
     */
    private void createStage(FXMLLoader loader) {

        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("riderly");
        stage.setResizable(false);
        stage.show();
    }


    /**
     *
     * Close stage
     *
     * @param stage  the stage
     */
    public void closeStage(Stage stage) {

        stage.close();
    }


    /**
     *
     * Show popup window
     *
     * @param applicationModal  the application modal
     */
    public void showPopupWindow(Modality applicationModal) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/User/Inchiriaza.fxml"));
        Stage stage = new Stage();
        stage.initModality(applicationModal);
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(scene);
        stage.setTitle("riderly - Inchiriere");
        stage.setResizable(false);
        stage.show();
    }


    /**
     *
     * Show popup window2
     *
     * @param applicationModal  the application modal
     */
    public void showPopupWindow2(Modality applicationModal) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/User/Returneaza.fxml"));
        Stage stage = new Stage();
        stage.initModality(applicationModal);
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(scene);
        stage.setTitle("riderly - Returnare");
        stage.setResizable(false);
        stage.show();
    }


    /**
     *
     * Show alert
     *
     * @param error  the error
     * @param eroare  the eroare
     * @param nuAtiCompletatToateCampurile  the nu ati completat toate campurile
     */
    public void showAlert(Alert.AlertType error, String eroare, String nuAtiCompletatToateCampurile) {

        Alert alert = new Alert(error);
        alert.setTitle(eroare);
        alert.setHeaderText(null);
        alert.setContentText(nuAtiCompletatToateCampurile);
        alert.showAndWait();

    }

    /**
     *
     * Show alert2
     *
     * @param applicationModal  the application modal
     */
    public void showAlert2(Modality applicationModal) {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Eroare");
        alert.setHeaderText(null);
        alert.setContentText("Ati inchiriat deja un vehicul!");
        alert.showAndWait();
    }



    /**
     *
     * Show alert3
     *
     * @param applicationModal  the application modal
     */
    public void showAlert3(Modality applicationModal) {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Eroare");
        alert.setHeaderText(null);
        alert.setContentText("Nu ati inchiriat niciun vehicul!");
        alert.showAndWait();
    }
}
