package home.riderly.Controllers.User;

import home.riderly.Models.IstoricBicicleta;
import home.riderly.Models.IstoricTrotineta;
import home.riderly.Models.Model;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class IstoricTrotController implements Initializable {
    public TableView<IstoricTrotineta> istoricTrotTbl;
    public TableColumn<IstoricTrotineta,String> userClm;
    public TableColumn<IstoricTrotineta,String> bicClm;
    public TableColumn<IstoricTrotineta,String> dateClm;
    public Button refreshBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
