package home.riderly.Views;

import home.riderly.Controllers.User.UserController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class ViewFactory {
    //Client
    private final StringProperty clientSelMenuItem;
    private AnchorPane bicicleteView;
    private AnchorPane trotineteView;
    private AnchorPane istoricView;
    private AnchorPane reportView;

    public ViewFactory() {
        this.clientSelMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelMenuItem() {
        return clientSelMenuItem;
    }

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

    public AnchorPane getIstoricView() {
        if (istoricView == null) {
            try {
                istoricView = new FXMLLoader(getClass().getResource("/Fxml/User/Istoric.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return istoricView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }


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

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/User/User.fxml"));
        UserController userController = new UserController();
        loader.setController(userController);
        createStage(loader);
    }

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

    public void closeStage(Stage stage) {
        stage.close();
    }

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
}