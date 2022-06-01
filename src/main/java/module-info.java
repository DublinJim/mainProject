module com.example.mainproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.mainproject to javafx.fxml;
    exports com.example.mainproject;
}