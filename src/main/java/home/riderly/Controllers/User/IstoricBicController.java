package home.riderly.Controllers.User;

import home.riderly.Models.IstoricBicicleta;
import home.riderly.Models.Model;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * The class Istoric bic controller implements initializable
 */
public class IstoricBicController implements Initializable {
    public TableView<IstoricBicicleta> istoricBicTbl;
    public TableColumn<IstoricBicicleta,String> userClm;
    public TableColumn<IstoricBicicleta,String> bicClm;
    public TableColumn<IstoricBicicleta,String> dateClm;
    public Button refreshBtn;


    @Override

/**
 *
 * Initialize
 *
 * @param location  the location
 * @param resources  the resources
 */
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<IstoricBicicleta> data = Model.getInstance().getDatabaseDriver().getIstoricBic();
        istoricBicTbl.setItems(data);
        userClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRideUser()));
        bicClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBicicleta()));
        dateClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDataInchiriere()));
        refreshBtn.setOnAction(event -> onRefreshBtn());
    }


    /**
     *
     * On refresh btn
     *
     */
    public void onRefreshBtn() {

        ObservableList<IstoricBicicleta> data = Model.getInstance().getDatabaseDriver().getIstoricBic();
        istoricBicTbl.setItems(data);
        userClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRideUser()));
        bicClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBicicleta()));
        dateClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDataInchiriere()));
    }
}
