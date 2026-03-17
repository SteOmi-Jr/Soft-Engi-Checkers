module example.com.vagve {
    requires javafx.controls;
    requires javafx.fxml;


    opens example.com.vagve to javafx.fxml;
    exports example.com.vagve;
}