module org.example.anonymousinnerclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.anonymousinnerclass to javafx.fxml;
    exports org.example.anonymousinnerclass;
}