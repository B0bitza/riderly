package home.riderly.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class ReportController implements Initializable {
    public ChoiceBox<String> choiceBoxReport;
    public TextArea textAreaReport;
    public Button submitRepBtn;

    private final String[] reportTypes={"Problema la Login","Problema cu interfata","Problema cu baza de date"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBoxReport.getItems().addAll(reportTypes);
    }
}
