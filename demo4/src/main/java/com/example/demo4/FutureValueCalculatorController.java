package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FutureValueCalculatorController {

    @FXML
    private TextField invAmtTextField;

    @FXML
    private TextField numYrsTextField;

    @FXML
    private TextField annualRateTextField;

    @FXML
    private TextField futureValueTextField;

    @FXML
    protected void calculateButtonPressed(ActionEvent event) {
        try {
            double investmentAmount = Double.parseDouble(invAmtTextField.getText());
            int numberOfYears = Integer.parseInt(numYrsTextField.getText());
            double annualInterestRate = Double.parseDouble(annualRateTextField.getText());

            double futureValue = investmentAmount * Math.pow(1 + annualInterestRate / 100, numberOfYears);
            futureValueTextField.setText(String.format("$%.2f", futureValue));
        } catch (NumberFormatException e) {
            futureValueTextField.setText("Invalid Input");
        }
    }
}