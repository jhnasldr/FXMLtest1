module com.example.fxmltest1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmltest1 to javafx.fxml;
    exports com.example.fxmltest1;
}