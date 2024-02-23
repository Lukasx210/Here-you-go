package group.rpoject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    private Label helloLabel;

    @FXML
    private void initialize() {
        // Set a welcome message
        helloLabel.setText("HELLO");
    }
}