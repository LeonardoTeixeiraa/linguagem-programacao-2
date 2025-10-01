module com.mycompany.demosingletonlazy {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.demosingletonlazy to javafx.fxml;
    exports com.mycompany.demosingletonlazy;
}
