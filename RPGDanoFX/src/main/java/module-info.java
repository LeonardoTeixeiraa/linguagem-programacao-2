module com.mycompany.cronicasdejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.rpgdanofx.model to javafx.fxml;
    exports com.mycompany.rpgdanofx.model;
}
