module org.client.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.client.app to javafx.fxml;
    exports org.client.app;
}