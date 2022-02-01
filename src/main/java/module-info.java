module com.example.batallamardelcoral {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.batallamardelcoral to javafx.fxml;
    exports com.example.batallamardelcoral;
}