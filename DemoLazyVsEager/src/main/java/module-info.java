module com.mycompany.demolazyvseager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.demolazyvseager to javafx.fxml;
    exports com.mycompany.demolazyvseager;
}
