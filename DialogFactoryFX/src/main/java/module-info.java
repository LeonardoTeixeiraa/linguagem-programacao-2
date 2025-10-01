module com.mycompany.dialogfactoryfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.dialogfactoryfx to javafx.fxml;
    exports com.mycompany.dialogfactoryfx;
}
