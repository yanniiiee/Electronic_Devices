module com.example.devices {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.devices to javafx.fxml;
    exports com.example.devices;
}