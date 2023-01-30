package home.riderly.Controllers.User;

import home.riderly.Models.Model;
import home.riderly.Models.SendEmail;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;


/**
 * The class Report controller implements initializable
 */
public class ReportController implements Initializable {
    public ChoiceBox<String> choiceBoxReport;
    public TextArea textAreaReport;
    public Button submitRepBtn;

    private final String[] reportTypes={"Problema la Login","Problema cu interfata","Problema cu baza de date"};


    @Override

/**
 *
 * Initialize
 *
 * @param url  the url
 * @param resourceBundle  the resource bundle
 */
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choiceBoxReport.getItems().addAll(reportTypes);
        submitRepBtn.setOnAction(event -> onSubmitReport());
    }

    /**
     *
     * On submit report
     *
     */
    private void onSubmitReport() {

        if (choiceBoxReport.getValue() == null || textAreaReport.getText().isEmpty()) {
            Model.getInstance().getViewFactory().showAlert(Alert.AlertType.ERROR, "Eroare", "Nu ati completat toate campurile");
        } else {
            Model.getInstance().insertReport(choiceBoxReport.getValue(),textAreaReport.getText(), LocalDate.now().toString());
            Model.getInstance().getViewFactory().showAlert(Alert.AlertType.INFORMATION, "Succes", "Raportul a fost trimis");
            SendEmail.send("vlad.gozman02@e-uvt.ro","Problema noua",textAreaReport.getText());
            choiceBoxReport.setValue(null);
            textAreaReport.setText("");

        }

    }


}
