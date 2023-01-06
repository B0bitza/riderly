module home.riderly {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens home.riderly to javafx.fxml;
    exports home.riderly;
}