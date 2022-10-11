module com.example.ejoanna {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejoanna to javafx.fxml;
    exports com.example.ejoanna;
}