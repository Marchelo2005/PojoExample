module com.example.pojoexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pojoexample to javafx.fxml;
    exports com.example.pojoexample;
}