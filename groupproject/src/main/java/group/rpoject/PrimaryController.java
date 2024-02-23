package group.rpoject;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private void login() throws IOException {
        // For simplicity, check for hardcoded username and password
        if ("admin".equals(usernameField.getText()) && "password".equals(passwordField.getText())) {
            App.setRoot("secondary");
        }
    }
}
