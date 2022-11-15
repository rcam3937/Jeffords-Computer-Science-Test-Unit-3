module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.desktop;

    opens com.testCode to javafx.fxml;
    exports com.testCode;
}