package home.riderly.Controllers.User;

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


/**
 * The class Istoric trot controller implements initializable
 */
public class IstoricTrotController implements Initializable {
    public TableView<IstoricTrotineta> istoricTrotTbl;
    public TableColumn<IstoricTrotineta,String> userClm;
    public TableColumn<IstoricTrotineta,String> bicClm;
    public TableColumn<IstoricTrotineta,String> dateClm;
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

        ObservableList<IstoricTrotineta> data = Model.getInstance().getDatabaseDriver().getIstoricTrot();
        istoricTrotTbl.setItems(data);
        userClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRideUser()));
        bicClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTrotineta()));
        dateClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDataInchiriere()));
        refreshBtn.setOnAction(event -> onRefreshBtn());
    }


    /**
     *
     * On refresh btn
     *
     */
    public void onRefreshBtn() {

        ObservableList<IstoricTrotineta> data = Model.getInstance().getDatabaseDriver().getIstoricTrot();
        istoricTrotTbl.setItems(data);
        userClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRideUser()));
        bicClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTrotineta()));
        dateClm.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDataInchiriere()));
    }
}
