package com.bitsilla.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private ComboBox chromoCombo;

    @FXML
    private TextField startPosField, endPosField;

    public void handleSearchButtonAction(ActionEvent actionEvent) {
        System.out.println("searching ..." + chromoCombo.getValue() + startPosField.getText() + endPosField.getText());
    }

}
