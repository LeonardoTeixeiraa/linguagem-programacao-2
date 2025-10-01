module com.mycompany.validacaousuariofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.validacaousuariofx to javafx.fxml;
    exports com.mycompany.validacaousuariofx;
}
