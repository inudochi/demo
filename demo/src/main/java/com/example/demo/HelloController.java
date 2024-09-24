package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Counter;

public class HelloController {
    @FXML
    private Label counterText;
    private Counter schet = new Counter(0);

    @FXML
    protected void onPlusButtonClick() {
        schet.Plus();
        counterText.setText(schet.toString());
    }

    @FXML
    protected void onMinusButtonClick() {
        schet.Minus();
        counterText.setText(schet.toString());
    }


}