module com.example.wetherreport {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.weatherReport to javafx.fxml;
    exports com.example.weatherReport;
}