module lk.ijse.controller {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens lk.ijse.controller to javafx.fxml;


    exports lk.ijse.controller;
}
