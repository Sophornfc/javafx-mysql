module com.mycompany.mysql {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.mysql to javafx.fxml;
    exports com.mycompany.mysql;
}
