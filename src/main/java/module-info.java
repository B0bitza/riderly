module home.riderly {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires jakarta.mail;

    opens home.riderly to javafx.fxml;
    exports home.riderly;
    exports home.riderly.Controllers;
    exports home.riderly.Controllers.User;
    exports home.riderly.Models;
    exports home.riderly.Views;
}