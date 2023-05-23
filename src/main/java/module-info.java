module com.example.morpion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morpion to javafx.fxml;
    exports com.example.morpion;
}