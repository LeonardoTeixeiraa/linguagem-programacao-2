module com.mycompany.demosingletoneager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.demosingletoneager to javafx.fxml;
    exports com.mycompany.demosingletoneager;
}
