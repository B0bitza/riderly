package home.riderly;

import home.riderly.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 * The class Application extends application
 */
public class App extends Application {

    @Override

/**
 *
 * Start
 *
 * @param stage  the stage
 */
    public void start(Stage stage) {

        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
