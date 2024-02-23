module group.rpoject {
    requires javafx.controls;
    requires javafx.fxml;

    opens group.rpoject to javafx.fxml;
    exports group.rpoject;
}
