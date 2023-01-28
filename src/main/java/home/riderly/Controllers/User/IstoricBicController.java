package home.riderly.Controllers.User;

import home.riderly.Models.Bicicleta;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import home.riderly.Models.DatabaseDriver;
import java.net.URL;
import java.util.ResourceBundle;

public class IstoricBicController implements Initializable {
    public TableView<Bicicleta> istoricBicTbl;
    public TableColumn<Bicicleta,String> userClm;
    public TableColumn<Bicicleta,String> bicClm;
    public TableColumn<Bicicleta,String> dateClm;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
