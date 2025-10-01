module com.mycompany.agenciaespectral {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.agenciaespectral to javafx.fxml;
    exports com.mycompany.agenciaespectral;
}
