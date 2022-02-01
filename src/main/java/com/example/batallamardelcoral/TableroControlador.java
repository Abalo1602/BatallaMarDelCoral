package com.example.batallamardelcoral;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TableroControlador {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}