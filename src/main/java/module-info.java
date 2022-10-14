module com.example.javafxtrinat2022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtrinat2022 to javafx.fxml;
    exports com.example.javafxtrinat2022;
}