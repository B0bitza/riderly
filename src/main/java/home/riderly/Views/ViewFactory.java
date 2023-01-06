package home.riderly.Views;

import home.riderly.Controllers.Client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.Objects;

public class ViewFactory {
    //Client
    private final StringProperty clientSelMenuItem;
    private AnchorPane bicicleteView;
    private AnchorPane trotineteView;

    public ViewFactory() {
        this.clientSelMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelMenuItem() {
        return clientSelMenuItem;
    }

    public AnchorPane getBicicleteView(){
        if (bicicleteView == null) {
            try {
                bicicleteView = new FXMLLoader(getClass().getResource("/Fxml/Client/Biciclete.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bicicleteView;
    }

    public AnchorPane getTrotineteView() {
        if(trotineteView == null){
            try{
                trotineteView= new FXMLLoader(getClass().getResource("/Fxml/Client/Trotinete.fxml")).load();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return trotineteView;
    }
    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }
    private void createStage(FXMLLoader loader){
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("riderly");
        stage.show();
    }

    public void closeStage(Stage stage){
        stage.close();
    }
}