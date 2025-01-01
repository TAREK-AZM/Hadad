module org.gestionetudients.edoc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.gestionetudients.edoc to javafx.fxml;
    exports org.gestionetudients.edoc;
}