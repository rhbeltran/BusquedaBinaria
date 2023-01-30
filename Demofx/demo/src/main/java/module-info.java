module com.example.rodrigo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.rodrigo to javafx.fxml;
    opens com.example.models;
    exports com.example.models;
    exports com.example.rodrigo;
}
